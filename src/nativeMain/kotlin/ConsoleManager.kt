import kernel.*
import kotlinx.cinterop.*
import kotlinx.coroutines.*
import platform.posix.*
import platform.windows.*
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

var codVersion = ""

object ConsoleManager {

    const val TH32CS_SNAPPROCESS: UInt = 0x00000002u

    private val tempFiles = mutableListOf<String>()

    @OptIn(ExperimentalForeignApi::class)
    fun setReadOnly(path: String): Boolean = memScoped {
        val result = SetFileAttributesW(path, FILE_ATTRIBUTE_READONLY.toUInt())
        return result != 0
    }

    @OptIn(ExperimentalForeignApi::class)
    fun readFile(path: String): String? = memScoped {
        val file = fopen(path, "r") ?: return null
        val buffer = ByteArray(4096)
        val content = StringBuilder()

        while (true) {
            val bytesRead = fread(buffer.refTo(0), 1.convert(), buffer.size.convert(), file)
            if (bytesRead <= 0u) break
            content.append(buffer.decodeToString(endIndex = bytesRead.toInt()))
        }

        fclose(file)
        return content.toString()
    }

    @OptIn(ExperimentalForeignApi::class)
    fun writeFile(path: String, content: String): Boolean = memScoped {
        val file = fopen(path, "w") ?: return false
        fprintf(file, "%s", content)
        fclose(file)
        return true
    }

    fun startCODM() {
        val path = "\"C:\\Program Files\\Tencent\\Androws\\Application\\AndrowsLauncher.exe\" --from \"2\" --launch-pkg-name \"com.activision.callofduty.shooter\" --launch-proc-name \"Androws.exe\""
        runPath(path)
    }

    fun startStore() {
        val androwsPath = "c:\\Program Files\\Tencent\\Androws\\Application"
        val latestFolder = getLatestVersionFolder(androwsPath)
        val path = "$androwsPath\\$latestFolder\\AndrowsStore.exe"
        runPath(path)
    }

    fun stopEmulator() {
        val processList = listOf(
            "AndrowsLauncher.exe",
            "AndrowsStore.exe",
            "AndrowsAsistant.exe",
            "Androws.exe",
            "ABoxHeadless.exe",
            "ABoxSVC.exe",
            "AndrowsVfs.exe",
            "AndrowsSvr.exe",
            "AceKeeper.exe",
            "AceKeeperService.exe",
            "AndrowsAiAssistant.exe",
            "AndrowsVm.exe",
            "AndrowsAiDocSeeker.exe"
        )

        for (proc in processList) {
            val pid = findPidByName(proc)
            if (pid != null) killProcessByPid(pid)
        }
    }

    @OptIn(ExperimentalForeignApi::class)
    fun findPidByName(processName: String): Int? {
        memScoped {
            val snapshot = my_CreateToolhelp32Snapshot(TH32CS_SNAPPROCESS.toUInt(), 0u)
            if (snapshot == INVALID_HANDLE_VALUE) {
                println("Nem sikerült folyamatlistát lekérni.")
                return null
            }

            val entry = alloc<PROCESSENTRY32>()
            entry.dwSize = sizeOf<PROCESSENTRY32>().toUInt()

            var hasNext = my_Process32First(snapshot, entry.ptr)
            while (hasNext != 0) {
                val exeName = entry.szExeFile.toKString()
                if (exeName.equals(processName, ignoreCase = true)) {
                    my_CloseHandle(snapshot)
                    return entry.th32ProcessID.toInt()
                }
                hasNext = my_Process32Next(snapshot, entry.ptr)
            }

            my_CloseHandle(snapshot)
        }
        return null
    }


    @OptIn(ExperimentalForeignApi::class)
    fun killProcessByPid(pid: Int): Boolean {
        val handle = OpenProcess(PROCESS_TERMINATE.toUInt(), 0, pid.toUInt())
        if (handle == null || handle == INVALID_HANDLE_VALUE) return false
        val result = TerminateProcess(handle, 0u)
        CloseHandle(handle)
        return result != 0
    }

    @OptIn(ExperimentalForeignApi::class, ExperimentalUuidApi::class)
    fun createShortcut(name: String, targetPath: String, iconPath: String, arguments: String): Boolean {
        val vbsContent = """
            Set oWS = WScript.CreateObject("WScript.Shell")
            sLinkFile = oWS.SpecialFolders("Desktop") & "\\$name.lnk"
            Set oLink = oWS.CreateShortcut(sLinkFile)
            oLink.TargetPath = "$targetPath"
            oLink.Arguments = "$arguments"
            oLink.IconLocation = "$iconPath"
            oLink.Save
        """.trimIndent()

        val tempPath = getenv("TEMP")?.toKString() ?: "C:\\Temp"
        val uuid = Uuid.random().toHexString()
        val filePath = "$tempPath\\$uuid.vbs"

        val file = fopen(filePath, "w")

        try {
            fprintf(file, "%s", vbsContent)
        } finally {
            fclose(file)
        }

        tempFiles.add("$uuid.vbs")

        val result = system("wscript \"$filePath\"")

        return result == 0
    }


    @OptIn(ExperimentalForeignApi::class)
    fun CoroutineScope.loading(text: String): Job {
        return launch {
            var dotCount = 0
            val maxDots = 3

            while (isActive) {
                val dots = ".".repeat(dotCount + 1)
                print("\r$text$dots   ")
                fflush(stdout)
                delay(300)
                dotCount = (dotCount+ 1) % maxDots
            }
        }
    }

    fun extractZip(zipPath: String, outputDir: String): Boolean {
        val command = "powershell -Command \"Expand-Archive -Path '$zipPath' -DestinationPath '$outputDir' -Force\""
        val result = system(command)
        return result == 0
    }

    @OptIn(ExperimentalForeignApi::class)
    fun findApkmFile(): String? {
        val downloadsPath = getSpecificPath(FOLDERID_Downloads) ?: return null
        val dir = opendir(downloadsPath) ?: return null

        val candidates = mutableListOf<Pair<String, List<Int>>>()

        try {
            while (true) {
                val entry = readdir(dir) ?: break
                val fileName = entry.pointed.d_name.toKString()

                if (
                    "callofduty" in fileName.lowercase() &&
                    (fileName.endsWith(".apkm") || fileName.endsWith(".zip"))
                ) {
                    val regex = Regex("""\d+(\.\d+)+""")
                    val versionStr = regex.find(fileName)?.value ?: continue
                    val versionParts = versionStr.split(".").map { it.toIntOrNull() ?: 0 }
                    candidates += downloadsPath + "\\" + fileName to versionParts

                }
            }
        } finally {
            closedir(dir)
        }

        val latest = candidates.maxWithOrNull { a, b ->
            val size = maxOf(a.second.size, b.second.size)
            for (i in 0 until size) {
                val av = a.second.getOrNull(i) ?: 0
                val bv = b.second.getOrNull(i) ?: 0
                if (av != bv) return@maxWithOrNull av.compareTo(bv)
            }
            0
        } ?: return null
        return latest.first.also { codVersion = latest.second.joinToString(".") }
    }

    @OptIn(ExperimentalForeignApi::class)
    fun getSpecificPath(pathId: _GUID): String? = memScoped {
        val pathPtr = alloc<LPWSTRVar>()
        val result = SHGetKnownFolderPath(pathId.ptr, 0u, null, pathPtr.ptr)

        if (result != S_OK) return null

        val path = pathPtr.value?.toKString()
        CoTaskMemFree(pathPtr.value)
        return path
    }

    @OptIn(ExperimentalForeignApi::class)
    fun getLatestVersionFolder(basePath: String): String? {
        memScoped {
            val data = alloc<WIN32_FIND_DATAW>()
            val handle = FindFirstFileW("$basePath\\*", data.ptr)

            if (handle == INVALID_HANDLE_VALUE) return null

            var latestVersion: List<Int>? = null
            var latestFolder: String? = null

            do {
                val name = data.cFileName.toKString()

                if (name == "." || name == "..") continue

                val fullPath = "$basePath\\$name"

                val attrs = GetFileAttributesW(fullPath)
                val isDir = (attrs != INVALID_FILE_ATTRIBUTES.toUInt()) &&
                        (attrs and FILE_ATTRIBUTE_DIRECTORY.toUInt() != 0u)

                if (isDir) {
                    val versionParts = name.split('.').mapNotNull { it.toIntOrNull() }
                    if (versionParts.isNotEmpty()) {
                        if (latestVersion == null || compareVersions(versionParts, latestVersion) > 0) {
                            latestVersion = versionParts
                            latestFolder = name
                        }
                    }
                }
            } while (FindNextFileW(handle, data.ptr) != 0)

            FindClose(handle)
            return latestFolder
        }
    }

    fun compareVersions(v1: List<Int>, v2: List<Int>): Int {
        val maxLen = maxOf(v1.size, v2.size)
        for (i in 0 until maxLen) {
            val part1 = v1.getOrNull(i) ?: 0
            val part2 = v2.getOrNull(i) ?: 0
            if (part1 != part2) return part1 - part2
        }
        return 0
    }

    @OptIn(ExperimentalForeignApi::class)
    fun renameApkmToZip(originalPath: String): String? {
        val newPath = "$originalPath.zip"

        memScoped {
            val success = MoveFileW(originalPath, newPath)
            if (success != 0) {
                return newPath
            }
        }

        return null
    }

    fun openImage(image: ByteArray) {
        val filePath = createTempFile(image, "png")
        runPath(filePath)
    }

    fun runPath(url: String): Boolean {
        val command = "start \"\" \"$url\""
        return system(command) == 0
    }

    fun readReaction(): String {
        while (true) {
            val reaction = readNativeLine()
            when (reaction) {
                "i", "n", "s", "k", "e", "t" -> return reaction
                else -> println("Nem támogatott válasz.")
            }
        }
    }

    @OptIn(ExperimentalForeignApi::class)
    fun runAndCapture(command: String): String {
        println(command)
        val output = StringBuilder()

        memScoped {
            val fp = _popen(command, "r") ?: return "1."
            val buffer = allocArray<ByteVar>(1024)

            while (fgets(buffer, 1024, fp) != null) {
                output.append(buffer.toKString())
            }

            val exitCode = _pclose(fp)
            if (exitCode != 0) return "2"
        }

        return output.toString()
    }

    @OptIn(ExperimentalForeignApi::class)
    private fun readNativeLine(): String? {
        val bufferSize = 256
        val buffer = ByteArray(bufferSize)
        val cstr = buffer.refTo(0)

        val result = fgets(cstr, bufferSize, stdin)
        return if (result != null) buffer.toKString().trimEnd('\n') else null
    }

    fun isRunningInConsole(): Boolean {
        return GetConsoleWindow() != null
    }

    @OptIn(ExperimentalForeignApi::class)
    fun relaunchInCmd() {
        val exePath = getExecutablePath() ?: return

        ShellExecuteW(
            null,
            "open",
            "cmd",
            "/k \"$exePath\"",
            null,
            SW_SHOWNORMAL
        )
    }

    @OptIn(ExperimentalForeignApi::class)
    private fun getExecutablePath(): String? {
        val buffer = nativeHeap.allocArray<WCHARVar>(260)
        val length = GetModuleFileNameW(null, buffer, 260u)
        return if (length > 0u) {
            buffer.toKString()
        } else {
            null
        }
    }

    @OptIn(ExperimentalUuidApi::class, ExperimentalForeignApi::class)
    fun createTempFile(fileContent: ByteArray, extension: String): String {
        val tempPath = getenv("TEMP")?.toKString() ?: "C:\\Temp"
        val uuid = Uuid.random().toHexString()
        val filePath = "$tempPath\\$uuid.$extension"

        val file = fopen(filePath, "wb") ?: return ""
        try {
            fwrite(fileContent.refTo(0), 1.convert(), fileContent.size.convert(), file)
        } finally {
            fclose(file)
        }

        tempFiles.add("$uuid.$extension")
        return filePath
    }

    @OptIn(ExperimentalForeignApi::class)
    fun deleteTempFiles() {
        val tempPath = getenv("TEMP")?.toKString() ?: "C:\\Temp"

        tempFiles.forEach {
            unlink("$tempPath\\$it")
            tempFiles.remove(it)
        }
    }
}