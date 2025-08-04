import kotlinx.cinterop.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking
import platform.posix.fclose
import platform.posix.fopen
import platform.posix.fwrite
import platform.posix.mkdir
import platform.windows.*

object Launcher {

    fun createSMKFile() {
        val configPath = "${ConsoleManager.getSpecificPath(FOLDERID_RoamingAppData)}\\Tencent\\Androws\\config"
        val codPath = "$configPath\\com.activision.callofduty.shooter"
        val smkPath = "$codPath\\smk.conf"

        if (!configPath.exists()) mkdir(configPath)

        if (!codPath.exists()) mkdir(codPath)

        ConsoleManager.writeFile(smkPath, SMK)
    }

    @OptIn(ExperimentalForeignApi::class, DelicateCoroutinesApi::class, ExperimentalCoroutinesApi::class)
    fun addCODMToWhiteList() {
        val newThread = newSingleThreadContext("Not UI")
        val job = CoroutineScope(newThread).launch {
            ConsoleManager.stopEmulator()

            delay(1000)

            val path = "C:\\AndrowsData\\app\\config\\com.tencent.androws.conf"

            val text = ConsoleManager.readFile(path)
            val searchedText = "\"AppRunningWhiteLists\":["
            val extraText = "\"com.activision.callofduty.shooter\","

            if (text != null) {
                val beforeText = text.substringBefore(searchedText)
                val afterText = text.substringAfter(searchedText)
                val newText = "$beforeText$searchedText$extraText$afterText"

                ConsoleManager.writeFile(path, newText)

                ConsoleManager.setReadOnly(path)
            }

            ConsoleManager.startStore()
        }

        updateLoading(strings[adding], job)

        runBlocking { job.join() }
        newThread.close()
    }

    @OptIn(DelicateCoroutinesApi::class, ExperimentalCoroutinesApi::class)
    fun unpackApkm(): String {
        val apkmFilePath = ConsoleManager.findApkmFile()
        val zipPath = apkmFilePath?.let { ConsoleManager.renameApkmToZip(apkmFilePath) }
        val extractionPath = "${ConsoleManager.getSpecificPath(FOLDERID_Downloads)}\\CODM_$codVersion"

        if (zipPath != null) {
            val newThread = newSingleThreadContext("Unpack")
            val job = CoroutineScope(newThread).launch {
                ConsoleManager.extractZip(zipPath, extractionPath)
            }

            updateLoading(strings[unpack], job)

            runBlocking { job.join() }

            return extractionPath
        } else {
            MessageBoxW(hwndMain, strings[error_unpack], strings[error], MB_OK.toUInt())
            return ""
        }
    }

    fun launchInstallCodm() {
        val androwsPath = "C:\\Program Files\\Tencent\\Androws\\Application\\"
        val latestFolder = ConsoleManager.getLatestVersionFolder(androwsPath)
        val newPath = "$androwsPath$latestFolder\\adb.exe"
        val output = ConsoleManager.runAndCapture("\"$newPath\" devices")
        val emulatorAvailable = output.lines().any { it.trim().startsWith("emulator") && it.contains("device") }

        if (emulatorAvailable) {
            val extractPath = unpackApkm()
            val installCompleted = installCodm(newPath, extractPath)
            if (!installCompleted) MessageBoxW(hwndMain, strings[install_failed], strings[error], MB_OK.toUInt())
        } else MessageBoxW(hwndMain, strings[error_detect], strings[error], MB_OK.toUInt())
    }

    @OptIn(ExperimentalForeignApi::class, DelicateCoroutinesApi::class, ExperimentalCoroutinesApi::class)
    fun createCodmIcon() {
        val roaming = ConsoleManager.getSpecificPath(FOLDERID_RoamingAppData)
        val iconPath = "$roaming\\Tencent\\Androws\\apps\\com.activision.callofduty.shooter\\com.activision.callofduty.shooter.ico"
        val codmFolderPath = "$roaming\\Tencent\\Androws\\apps\\com.activision.callofduty.shooter"

        val newThread = newSingleThreadContext("Icon")

        val job = CoroutineScope(newThread).launch {
            if (!iconPath.exists()) {
                if (!codmFolderPath.exists()) mkdir(codmFolderPath)

                val file = fopen(iconPath, "wb")
                try {
                    fwrite(codmIco.refTo(0), 1.convert(), codmIco.size.convert(), file)
                } finally {
                    fclose(file)
                }
            }

            ConsoleManager.createShortcut(
                name = "Androws - CODM",
                targetPath = "C:\\Program Files\\Tencent\\Androws\\Application\\AndrowsLauncher.exe",
                iconPath = iconPath,
                arguments = "--from \"\"2\"\" --launch-pkg-name \"\"com.activision.callofduty.shooter\"\" --launch-proc-name \"\"Androws.exe\"\""
            )
        }

        updateLoading(strings[icon], job)

        runBlocking { job.join() }
    }

    @OptIn(DelicateCoroutinesApi::class, ExperimentalCoroutinesApi::class)
    fun installCodm(adbPath: String, apkFolder: String): Boolean {
        val baseApk = "$apkFolder\\base.apk"
        val audioApk = "$apkFolder\\split_AssetPackAudio.apk"
        val configApk = "$apkFolder\\split_AssetPackConfig.apk"
        val mainApk = "$apkFolder\\split_AssetPackMain.apk"
        val patchApk = "$apkFolder\\split_AssetPackPatch1.apk"
        val videoApk = "$apkFolder\\split_AssetPackVideo.apk"
        val armApk = "$apkFolder\\split_config.arm64_v8a.apk"

        var completed = false

        val newThread = newSingleThreadContext("Install")
        val job = CoroutineScope(newThread).launch {
            val output = ConsoleManager.runAndCapture("\"\"$adbPath\" install-multiple \"$baseApk\" \"$audioApk\" \"$patchApk\" \"$videoApk\" \"$configApk\" \"$mainApk\" \"$armApk\"\"")
            completed = "Success" in output
        }

        updateLoading(strings[installing], job)

        runBlocking { job.join() }

        return completed
    }
}