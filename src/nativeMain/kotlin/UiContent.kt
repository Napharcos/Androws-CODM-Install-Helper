@file:OptIn(ExperimentalForeignApi::class)

import kotlinx.cinterop.*
import kotlinx.coroutines.Job
import platform.windows.*

const val W_STATIC = "STATIC"
const val W_BUTTON = "BUTTON"
const val W_EDIT = "EDIT"

var mainWidth = 535
var mainHeight = 400
const val separatorHeight = 1
const val titleHeight = 35
const val textHeight = 20
const val buttonHeight = 25
const val buttonWidth = 80
const val radioButtonHeight = 20
const val radioButtonWidth = 150
const val margin = 10

lateinit var hwndMain: HWND
var reg: HKEY? = null
var instance: HMODULE? = null

val container by lazy {
    CreateWindowExW(
        dwExStyle = 0u,
        lpClassName = className,
        lpWindowName = null,
        dwStyle = (WS_CHILD or WS_VISIBLE or WS_VSCROLL).toUInt(),
        X = 130,
        Y = 0,
        nWidth = mainWidth - 130,
        nHeight = mainHeight - margin * 2 - buttonHeight - 1,
        hWndParent = hwndMain,
        hMenu = null,
        hInstance = instance,
        lpParam = null
    )
}


val title by lazy {
    CreateWindowExW(
        dwExStyle = 0u,
        lpClassName = W_STATIC,
        lpWindowName = strings[welcome],
        dwStyle = WS_CHILD.toUInt() or WS_VISIBLE.toUInt() or SS_CENTER.toUInt(),
        X = margin,
        Y = margin,
        nWidth = mainWidth - (margin * 2),
        nHeight = titleHeight,
        hWndParent = hwndMain,
        hMenu = null,
        hInstance = null,
        lpParam = null
    )
}

val text1 by lazy {
    CreateWindowExW(
        dwExStyle = 0u,
        lpClassName = W_STATIC,
        lpWindowName = strings[text_1],
        dwStyle = WS_CHILD.toUInt() or WS_VISIBLE.toUInt(),
        X = margin,
        Y = titleHeight + margin,
        nWidth = mainWidth - (margin * 2),
        nHeight = textHeight * 2,
        hWndParent = hwndMain,
        hMenu = null,
        hInstance = null,
        lpParam = null
    )
}

val text1_1 by lazy {
    CreateWindowExW(
        dwExStyle = 0u,
        lpClassName = W_STATIC,
        lpWindowName = strings[text_1_1],
        dwStyle = WS_CHILD.toUInt() or WS_VISIBLE.toUInt(),
        X = margin,
        Y = titleHeight + margin + (textHeight * 2),
        nWidth = mainWidth - (margin * 2),
        nHeight = textHeight,
        hWndParent = hwndMain,
        hMenu = null,
        hInstance = null,
        lpParam = null
    )
}

const val CANCEL_BUTTON_ID = 1000
val cancelButton by lazy {
    CreateWindowExW(
        dwExStyle = 0u,
        lpClassName = W_BUTTON,
        lpWindowName = strings[cancel],
        dwStyle = WS_CHILD.toUInt() or WS_VISIBLE.toUInt(),
        X = mainWidth - margin - buttonWidth,
        Y = mainHeight - margin - buttonHeight,
        nWidth = buttonWidth,
        nHeight = buttonHeight,
        hWndParent = hwndMain,
        hMenu = CANCEL_BUTTON_ID.toLong().toCPointer(),
        hInstance = instance,
        lpParam = null
    )
}

const val BACK_BUTTON_ID = 1001
val backButton by lazy {
    CreateWindowExW(
        dwExStyle = 0u,
        lpClassName = W_BUTTON,
        lpWindowName = strings[back],
        dwStyle = WS_CHILD.toUInt() or WS_VISIBLE.toUInt(),
        X = mainWidth - (margin * 2) - (buttonWidth * 3) - 2,
        Y = mainHeight - margin - buttonHeight,
        nWidth = buttonWidth,
        nHeight = buttonHeight,
        hWndParent = hwndMain,
        hMenu = BACK_BUTTON_ID.toLong().toCPointer(),
        hInstance = instance,
        lpParam = null
    )
}

const val SKIP_BUTTON_ID = 1002
val skipButton by lazy {
    CreateWindowExW(
        dwExStyle = 0u,
        lpClassName = W_BUTTON,
        lpWindowName = strings[skip],
        dwStyle = WS_CHILD.toUInt() or WS_VISIBLE.toUInt(),
        X = margin,
        Y = mainHeight - margin - buttonHeight,
        nWidth = buttonWidth * 2,
        nHeight = buttonHeight,
        hWndParent = hwndMain,
        hMenu = SKIP_BUTTON_ID.toLong().toCPointer(),
        hInstance = instance,
        lpParam = null
    )
}

const val NEXT_BUTTON_ID = 1003
val nextButton by lazy {
    CreateWindowExW(
        dwExStyle = 0u,
        lpClassName = W_BUTTON,
        lpWindowName = strings[next],
        dwStyle = WS_CHILD.toUInt() or WS_VISIBLE.toUInt(),
        X = mainWidth - (margin * 2) - (buttonWidth * 2),
        Y = mainHeight - margin - buttonHeight,
        nWidth = buttonWidth,
        nHeight = buttonHeight,
        hWndParent = hwndMain,
        hMenu = NEXT_BUTTON_ID.toLong().toCPointer(),
        hInstance = instance,
        lpParam = null
    )
}

val separator by lazy {
    CreateWindowExW(
        dwExStyle = 0u,
        lpClassName = W_STATIC,
        lpWindowName = null,
        dwStyle = (WS_CHILD or WS_VISIBLE).toUInt(),
        X = 0,
        Y = mainHeight - (margin * 2) - buttonHeight,
        nWidth = mainWidth,
        nHeight = separatorHeight,
        hWndParent = hwndMain,
        hMenu = null,
        hInstance = instance,
        lpParam = null
    )
}

val vSeparator by lazy {
    CreateWindowExW(
        dwExStyle = 0u,
        lpClassName = W_STATIC,
        lpWindowName = null,
        dwStyle = (WS_CHILD or WS_VISIBLE).toUInt(),
        X = 120,
        Y = 0,
        nWidth = 1,
        nHeight = mainHeight - margin * 2 - buttonHeight,
        hWndParent = hwndMain,
        hMenu = null,
        hInstance = instance,
        lpParam = null
    )
}

const val EN_LANG_RADIO_ID = 2001
val radio1 by lazy {
    CreateWindowExW(
        dwExStyle = 0u,
        lpClassName = W_BUTTON,
        lpWindowName = strings[lang_en],
        dwStyle = WS_CHILD.toUInt() or WS_VISIBLE.toUInt() or BS_AUTORADIOBUTTON.toUInt() or WS_GROUP.toUInt(),
        X = (mainWidth - radioButtonWidth) / 2,
        Y = margin * 2 + titleHeight + textHeight * 4,
        nWidth = radioButtonWidth,
        nHeight = radioButtonHeight,
        hWndParent = hwndMain,
        hMenu = EN_LANG_RADIO_ID.toLong().toCPointer(),
        hInstance = null,
        lpParam = null
    )
}

const val HU_LANG_RADIO_ID = 2002
val radio2 by lazy {
    CreateWindowExW(
        dwExStyle = 0u,
        lpClassName = W_BUTTON,
        lpWindowName = strings[lang_hu],
        dwStyle = WS_CHILD.toUInt() or WS_VISIBLE.toUInt() or BS_AUTORADIOBUTTON.toUInt(),
        X = (mainWidth - radioButtonWidth) / 2,
        Y = margin * 2 + titleHeight + textHeight * 4 + radioButtonHeight,
        nWidth = radioButtonWidth,
        nHeight = radioButtonHeight,
        hWndParent = hwndMain,
        hMenu = HU_LANG_RADIO_ID.toLong().toCPointer(),
        hInstance = null,
        lpParam = null
    )
}

val text2 by lazy {
    CreateWindowExW(
        dwExStyle = 0u,
        lpClassName = W_EDIT,
        lpWindowName = null,
        dwStyle = WS_CHILD.toUInt() or WS_VISIBLE.toUInt() or WS_BORDER.toUInt() or ES_AUTOVSCROLL.toUInt() or
                ES_MULTILINE.toUInt() or WS_VSCROLL.toUInt() or ES_READONLY.toUInt(),
        X = margin,
        Y = titleHeight + margin,
        nWidth = mainWidth - (margin * 2),
        nHeight = mainHeight - titleHeight - buttonHeight - (margin * 4),
        hWndParent = hwndMain,
        hMenu = null,
        hInstance = null,
        lpParam = null
    )
}

val text3 by lazy {
    CreateWindowExW(
        dwExStyle = 0u,
        lpClassName = W_STATIC,
        lpWindowName = strings[text_3],
        dwStyle = WS_CHILD.toUInt() or WS_VISIBLE.toUInt(),
        X = margin,
        Y = titleHeight + margin,
        nWidth = mainWidth - (margin * 2),
        nHeight = textHeight * 4,
        hWndParent = hwndMain,
        hMenu = null,
        hInstance = null,
        lpParam = null
    )
}

const val OPEN_BUTTON_ID = 1004
val openButton by lazy {
    CreateWindowExW(
        dwExStyle = 0u,
        lpClassName = W_BUTTON,
        lpWindowName = strings[open],
        dwStyle = WS_CHILD.toUInt() or WS_VISIBLE.toUInt(),
        X = (mainWidth - buttonWidth * 2) / 3,
        Y = (mainHeight - margin * 3 - buttonHeight - titleHeight - textHeight * 4) / 2 + margin + titleHeight + textHeight * 4,
        nWidth = buttonWidth,
        nHeight = buttonHeight,
        hWndParent = hwndMain,
        hMenu = OPEN_BUTTON_ID.toLong().toCPointer(),
        hInstance = instance,
        lpParam = null
    )
}

const val GUIDE_BUTTON_ID = 1005
val guideButton by lazy {
    CreateWindowExW(
        dwExStyle = 0u,
        lpClassName = W_BUTTON,
        lpWindowName = strings[open],
        dwStyle = WS_CHILD.toUInt() or WS_VISIBLE.toUInt(),
        X = (mainWidth - buttonWidth * 2) / 3 + buttonWidth + (mainWidth - buttonWidth * 2) / 3,
        Y = (mainHeight - margin * 3 - buttonHeight - titleHeight - textHeight * 4) / 2 + margin + titleHeight + textHeight * 4,
        nWidth = (buttonWidth * 1.5).toInt(),
        nHeight = buttonHeight,
        hWndParent = hwndMain,
        hMenu = GUIDE_BUTTON_ID.toLong().toCPointer(),
        hInstance = instance,
        lpParam = null
    )
}

const val INSTALL_BUTTON_ID = 1006
val installButton by lazy {
    CreateWindowExW(
        dwExStyle = 0u,
        lpClassName = W_BUTTON,
        lpWindowName = strings[open],
        dwStyle = WS_CHILD.toUInt() or WS_VISIBLE.toUInt(),
        X = (mainWidth - buttonWidth) / 2,
        Y = (mainHeight - margin * 3 - buttonHeight - titleHeight - textHeight * 4) / 2 + margin + titleHeight + textHeight * 4,
        nWidth = buttonWidth,
        nHeight = buttonHeight,
        hWndParent = hwndMain,
        hMenu = INSTALL_BUTTON_ID.toLong().toCPointer(),
        hInstance = instance,
        lpParam = null
    )
}

val loading by lazy {
    CreateWindowExW(
        dwExStyle = 0u,
        lpClassName = W_STATIC,
        lpWindowName = strings[adding],
        dwStyle = WS_CHILD.toUInt() or WS_VISIBLE.toUInt() or SS_CENTER.toUInt(),
        X = margin,
        Y = (mainHeight - margin * 3 - buttonHeight - titleHeight - textHeight * 4) / 2 + margin + titleHeight + textHeight * 4,
        nWidth = mainWidth - margin * 2,
        nHeight = buttonHeight,
        hWndParent = hwndMain,
        hMenu = null,
        hInstance = instance,
        lpParam = null
    )
}

val whiteBrush = CreateSolidBrush(RGB(255, 255, 255).toUInt())

val grayBrush = CreateSolidBrush(RGB(200, 200, 200).toUInt())

fun LOWORD(value: Int): Int = value and 0xFFFF

fun HIWORD(value: Int): Int = (value shr 16) and 0xFFFF

fun RGB(r: Int, g: Int, b: Int): Int = (b shl 16) or (g shl 8) or r

const val WHEEL_DELTA = 120

fun GET_WHEEL_DELTA_WPARAM(wParam: LPARAM): Int {
    return (HIWORD(wParam.toInt()).toShort()).toInt()
}

val titleFont = memScoped {
    val lf = alloc<LOGFONTW>().apply {
        lfHeight = -18
        lfWeight = FW_BOLD
        lfCharSet = DEFAULT_CHARSET.toUByte()
    }
    CreateFontIndirectW(lf.ptr)
}

fun updateLoading(text: String?, job: Job) {
    var dotCount = 0
    val maxDots = 3

    while (job.isActive) {
        val dots = ".".repeat(dotCount + 1)
        SetWindowTextW(loading, "$text$dots")
        updatePageVisibility()
        processWindowsMessages()
        Sleep(300u)
        dotCount = (dotCount + 1) % maxDots
    }
}

@OptIn(ExperimentalForeignApi::class)
fun processWindowsMessages() {
    memScoped {
        val msg = alloc<MSG>()
        while (PeekMessageW(msg.ptr, null, 0u, 0u, PM_REMOVE.toUInt()) != 0) {
            TranslateMessage(msg.ptr)
            DispatchMessageW(msg.ptr)
        }
    }
}