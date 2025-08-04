import kotlinx.cinterop.*
import platform.windows.*
import platform.windows.WS_VSCROLL

@OptIn(ExperimentalForeignApi::class)
fun main() = memScoped {
    instance = GetModuleHandleW(null)

    val wndClass = alloc<WNDCLASSW>().apply {
        style = CS_HREDRAW.toUInt() or CS_VREDRAW.toUInt()
        lpfnWndProc = staticCFunction(::wndProc)
        hInstance = instance
        lpszClassName = className.wcstr.ptr
        hCursor = LoadCursorW(null, IDC_ARROW)
        hbrBackground = GetStockObject(WHITE_BRUSH)?.reinterpret()
    }

    RegisterClassW(wndClass.ptr)

    val screenWidth = GetSystemMetrics(SM_CXSCREEN)
    val screenHeight = GetSystemMetrics(SM_CYSCREEN)
    val posX = (screenWidth - mainWidth) / 2
    val posY = (screenHeight - mainHeight) / 2

    hwndMain = CreateWindowExW(
        0u, className, "Androws-CODM-Install-Helper",
        WS_OVERLAPPED.toUInt() or WS_CAPTION.toUInt() or
        WS_SYSMENU.toUInt() or WS_MINIMIZEBOX.toUInt(),
        posX, posY, mainWidth, mainHeight,
        null, null, instance, null
    ) ?: error("Az ablak létrehozása sikertelen.")

    val rect = alloc<RECT>()
    GetClientRect(hwndMain, rect.ptr)

    mainWidth = rect.right - rect.left
    mainHeight = rect.bottom - rect.top

    reg = createRegistry()

    strings = initStrings()

    start(Steps.SELECT_LANGUAGE)

    SendMessageW(title, WM_SETFONT.toUInt(), titleFont.toLong().toULong(), TRUE.toLong())

    ShowWindow(hwndMain, SW_SHOW)

    val msg = nativeHeap.alloc<MSG>()
    while (GetMessageW(msg.ptr, null, 0u, 0u) > 0) {
        TranslateMessage(msg.ptr)
        DispatchMessageW(msg.ptr)
    }
    nativeHeap.free(msg)
}

const val className = "Window"

@OptIn(ExperimentalForeignApi::class)
fun createRegistry(): HKEY? = memScoped {
    val path = "Software\\AndrowsCODMInstallHelper"
    val hKeyVar = alloc<CPointerVar<HKEY__>>()
    val result = RegCreateKeyExW(
        hKey = HKEY_CURRENT_USER,
        lpSubKey = path,
        Reserved = 0u,
        lpClass = null,
        dwOptions = REG_OPTION_NON_VOLATILE.toUInt(),
        samDesired = KEY_ALL_ACCESS.toUInt(),
        lpSecurityAttributes = null,
        phkResult = hKeyVar.ptr,
        lpdwDisposition = null
    )
    if (result == ERROR_SUCCESS.toInt()) hKeyVar.value else null
}

@OptIn(ExperimentalForeignApi::class)
fun setValue(hKey: HKEY, name: String, value: String): Boolean = memScoped {
    val valueW = value.wcstr
    val result = RegSetValueExW(
        hKey = hKey,
        lpValueName = name,
        Reserved = 0u,
        dwType = REG_SZ.toUInt(),
        lpData = valueW.ptr.reinterpret(),
        cbData = (valueW.size * 2).toUInt()
    )
    result == ERROR_SUCCESS.toInt()
}

@OptIn(ExperimentalForeignApi::class)
fun getValue(hKey: HKEY, name: String): String? = memScoped {
    val bufferSize = 256
    val buffer = allocArray<WCHARVar>(bufferSize)
    val dataSize = alloc<DWORDVar>()
    dataSize.value = (bufferSize * 2).toUInt()

    val result = RegQueryValueExW(
        hKey = hKey,
        lpValueName = name,
        lpReserved = null,
        lpType = null,
        lpData = buffer.reinterpret(),
        lpcbData = dataSize.ptr
    )

    return@memScoped if (result == ERROR_SUCCESS.toInt()) buffer.toKString() else null
}