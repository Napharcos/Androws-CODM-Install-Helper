import ConsoleManager.openImage
import Launcher.addCODMToWhiteList
import Launcher.createCodmIcon
import Launcher.launchInstallCodm
import kotlinx.cinterop.*
import kotlinx.cinterop.alloc
import platform.windows.*

lateinit var currentStep: Steps

var activeEditId: Int? = null

@OptIn(ExperimentalForeignApi::class)
fun wndProc(hwnd: HWND?, msg: UINT, wParam: WPARAM, lParam: LPARAM): LRESULT {
    when (msg) {
        WM_SETCURSOR.toUInt() -> {
            val iBeamCursor = LoadCursorW(null, IDC_IBEAM)
            val hwndUnderCursor = wParam.toLong().toCPointer<HWND__>()!!

            if (keyMaps[selectedKeymap]?.keys?.any { it.hwnd == hwndUnderCursor } == true) {
                SetCursor(iBeamCursor)
                return 1
            }
        }

        WM_COMMAND.toUInt() -> {
            val controlId = LOWORD(wParam.toInt())

            if (controlId == CANCEL_BUTTON_ID) {
                PostMessageW(hwnd, WM_CLOSE.toUInt(), 0u, 0L)
            } else currentStep.clicked(controlId)
        }

        WM_CTLCOLORSTATIC.toUInt() -> {
            whiteBrush?.let {
                val hdc = wParam.toLong().toCPointer<HDC__>()!!
                val childHwnd = lParam.toLong().toCPointer<HWND__>()!!

                SetBkMode(hdc, TRANSPARENT)

                val selectedHwnd = keyMaps[selectedKeymap]?.hwnd

                if (childHwnd == separator || childHwnd == vSeparator || childHwnd == selectedHwnd) {
                    grayBrush?.let { gray ->
                        return gray.rawValue.toLong()
                    }
                }

                return it.rawValue.toLong()
            }
        }

        WM_DRAWITEM.toUInt() -> {
            val drawItem = lParam.toLong().toCPointer<DRAWITEMSTRUCT>()!!
            val hdc = drawItem.pointed.hDC
            val rect = drawItem.pointed.rcItem
            val hwnd = drawItem.pointed.hwndItem
            val text = getWindowText(hwnd)
            val selectedHwnd = keyMaps[selectedKeymap]?.hwnd

            if (hwnd == selectedHwnd) {
                grayBrush?.let {
                    FillRect(hdc, rect.ptr, it)
                }
            }

            SetBkMode(hdc, TRANSPARENT)

            val flags = if (text.isSingleLine(hwnd))
                DT_CENTER.toUInt() or DT_VCENTER.toUInt() or DT_SINGLELINE.toUInt()
            else DT_CENTER.toUInt() or DT_WORDBREAK.toUInt() or DT_END_ELLIPSIS.toUInt()

            DrawTextW(hdc, text, -1, rect.ptr, flags)

            return 1
        }

        WM_CLOSE.toUInt() -> {
            val result = MessageBoxW(
                hwnd,
                strings[cancel_text],
                strings[confirmation],
                (MB_OKCANCEL or MB_ICONQUESTION).toUInt()
            )

            if (result == IDOK) {
                DestroyWindow(hwnd)
            }
            return 0
        }

        WM_DESTROY.toUInt() -> {
            ConsoleManager.deleteTempFiles()
            PostQuitMessage(0)
            return 0
        }

        WM_MOUSEWHEEL.toUInt() -> {
            val delta = GET_WHEEL_DELTA_WPARAM(wParam.toLong())
            val lines = delta / WHEEL_DELTA

            val scrollAmount = -lines

            memScoped {
                val si = alloc<SCROLLINFO>().apply {
                    cbSize = sizeOf<SCROLLINFO>().toUInt()
                    fMask = SIF_ALL.toUInt()
                    nMin = 0
                }

                GetScrollInfo(hwnd, SB_VERT, si.ptr)

                val oldPos = si.nPos

                val maxScrollPos = keyMaps[selectedKeymap]?.keys?.size?.minus(9)

                si.nPos = (si.nPos + scrollAmount).coerceIn(0, maxScrollPos)
                si.nMax = keyMaps[selectedKeymap]?.keys?.size?.minus(1) ?: 9
                si.nPage = 9u

                SetScrollInfo(hwnd, SB_VERT, si.ptr, TRUE)

                if (si.nPos != oldPos) {
                    val textHeight = 35
                    val editHeight = 20

                    keyMaps[selectedKeymap]?.keys?.withIndex()?.forEach { (i, k) ->
                        val currentTextY = 5 + textHeight * i
                        val newTextY = currentTextY - si.nPos * textHeight
                        val currentEditY = 5 + textHeight * i + (textHeight - editHeight) / 2 - si.nPos * textHeight
                        SetWindowPos(k.hwndText, null, 0, newTextY, 0, 0, SWP_NOSIZE.toUInt() or SWP_NOZORDER.toUInt())
                        SetWindowPos(k.hwnd, null, 0 + keymapTextWidth + 10, currentEditY, 0, 0, SWP_NOSIZE.toUInt() or SWP_NOZORDER.toUInt())
                    }
                }
            }

            return 0
        }


        WM_VSCROLL.toUInt() -> {
            memScoped {
                val action = LOWORD(wParam.toInt())
                val position = HIWORD(wParam.toInt())

                val maxScrollPos = keyMaps[selectedKeymap]?.keys?.size?.minus(9)

                val si = alloc<SCROLLINFO>().apply {
                    cbSize = sizeOf<SCROLLINFO>().toUInt()
                    fMask = SIF_ALL.toUInt()
                    nMin = 0
                }
                GetScrollInfo(hwnd, SB_VERT, si.ptr)

                val oldPos = si.nPos

                when (action) {
                    SB_LINEUP -> si.nPos -= 1
                    SB_LINEDOWN -> si.nPos += 1
                    SB_PAGEUP -> si.nPos -= si.nPage.toInt()
                    SB_PAGEDOWN -> si.nPos += si.nPage.toInt()
                    SB_THUMBTRACK -> si.nPos = position
                }

                si.nPos = si.nPos.coerceIn(0, maxScrollPos)
                si.nMax = keyMaps[selectedKeymap]?.keys?.size?.minus(1) ?: 9
                si.nPage = 9u

                SetScrollInfo(hwnd, SB_VERT, si.ptr, TRUE)

                if (si.nPos != oldPos) {
                    val textHeight = 35
                    val editHeight = 20

                    keyMaps[selectedKeymap]?.keys?.withIndex()?.forEach { (i, k) ->
                        val currentTextY = 5 + textHeight * i
                        val newTextY = currentTextY - si.nPos * textHeight
                        val currentEditY = 5 + textHeight * i + (textHeight - editHeight) / 2 - si.nPos * textHeight
                        SetWindowPos(k.hwndText, null, 0, newTextY, 0, 0, SWP_NOSIZE.toUInt() or SWP_NOZORDER.toUInt())
                        SetWindowPos(k.hwnd, null, 0 + keymapTextWidth + 10, currentEditY, 0, 0, SWP_NOSIZE.toUInt() or SWP_NOZORDER.toUInt())
                    }
                }
            }
            return 0
        }

        WM_KEYDOWN.toUInt() -> {
            if (activeEditId != null) {
                val key = keyMaps[selectedKeymap]?.keys?.firstOrNull { it.buttonId == activeEditId }
                if (key != null) {
                    val code = wParam.toInt()

                    updateKeyCode(key.id, code)

                    val char = code.keyCodeToName()

                    char?.let {
                        val hwnd = keyMaps[selectedKeymap]?.keys?.find { it.buttonId == activeEditId }?.hwnd

                        HideCaret(hwnd)
                        DestroyCaret()

                        SetWindowTextW(key.hwnd, char)

                        updateKey(key.id, char)

                        activeEditId = null
                    }
                }
            }
            0
        }

        WM_SYSKEYDOWN.toUInt() -> {
            if (activeEditId != null) {
                val key = keyMaps[selectedKeymap]?.keys?.firstOrNull { it.buttonId == activeEditId }
                if (key != null) {
                    val code = wParam.toInt()

                    updateKeyCode(key.id, code)

                    val char = code.keyCodeToName()

                    char?.let {
                        val hwnd = keyMaps[selectedKeymap]?.keys?.find { it.buttonId == activeEditId }?.hwnd

                        HideCaret(hwnd)
                        DestroyCaret()

                        SetWindowTextW(key.hwnd, char)

                        updateKey(key.id, char)

                        activeEditId = null
                    }
                }
                0
            }
        }

        WM_CHAR.toUInt() -> {
            if (activeEditId != null) {
                val key = keyMaps[selectedKeymap]?.keys?.find { it.buttonId == activeEditId }
                if (key != null) {
                    val char = wParam.toInt().toChar().toString()

                    val hwnd = keyMaps[selectedKeymap]?.keys?.find { it.buttonId == activeEditId }?.hwnd

                    HideCaret(hwnd)
                    DestroyCaret()

                    SetWindowTextW(key.hwnd, char.uppercase())

                    updateKey(key.id, char)

                    activeEditId = null
                }
            }
            0
        }
    }

    return DefWindowProcW(hwnd, msg, wParam, lParam)
}

fun start(step: Steps) {
    currentStep = step
    if (step == Steps.SELECT_LANGUAGE) initLanguage()
    if (step == Steps.CODM_KEYMAP) {
        initKeyMapUI()
        updateKeymapPageText()
    }
    updatePageVisibility()
}

@OptIn(ExperimentalForeignApi::class)
fun updatePageVisibility() {
    Steps.entries.forEach { step ->
        step.elements.forEach {
            ShowWindow(it, SW_HIDE)
        }
    }

    keyMaps.entries.forEach { (_, value) ->
        ShowWindow(value.hwnd, SW_HIDE)
        value.keys.forEach {
            ShowWindow(it.hwndText, SW_HIDE)
            ShowWindow(it.hwnd, SW_HIDE)
        }
    }

    currentStep.elements.forEach {
        ShowWindow(it, SW_SHOW)
    }

    if (currentStep == Steps.CODM_KEYMAP) {
        keyMaps.entries.forEach { (key, value) ->
            ShowWindow(value.hwnd, SW_SHOW)
            if (key == selectedKeymap) {
                value.keys.forEach {
                    ShowWindow(it.hwndText, SW_SHOW)
                    ShowWindow(it.hwnd, SW_SHOW)
                }
            }
        }
    }
}

@OptIn(ExperimentalForeignApi::class)
fun getWindowText(hwnd: HWND?): String {
    memScoped {
        val size = 256
        val buffer = allocArray<UShortVar>(size)
        GetWindowTextW(hwnd, buffer, size)

        return buffer.toKString()
    }
}

const val keymapTextWidth = 250

@OptIn(ExperimentalForeignApi::class)
fun initKeyMapUI() {
    val x = 0
    val startY = 5
    val buttonHeight = 50
    val textHeight = 35
    val editHeight = 20

    keyMaps.entries.forEach { (key, value) ->
        val index = key - 4001
        val y = 0 + buttonHeight * index

        val static = CreateWindowExW(
            0u, W_STATIC, value.name,
            WS_CHILD.toUInt() or WS_VISIBLE.toUInt() or SS_NOTIFY.toUInt() or SS_CENTER.toUInt() or SS_OWNERDRAW.toUInt(),
            0, y, 120, buttonHeight,
            hwndMain, key.toLong().toCPointer(), instance, null
        )

        value.hwnd = static

        value.keys.withIndex().forEach { (i, k) ->
            val y = startY + textHeight * i

            val static = CreateWindowExW(
                0u, W_STATIC, null,
                WS_CHILD.toUInt() or WS_VISIBLE.toUInt() or SS_NOPREFIX.toUInt() or SS_OWNERDRAW.toUInt(),
                x, y, keymapTextWidth, textHeight,
                container, null, instance, null
            )

            k.hwndText = static

            val edit = CreateWindowExW(
                0u, W_STATIC, k.currentKey,
                WS_CHILD.toUInt() or WS_VISIBLE.toUInt() or WS_BORDER.toUInt() or SS_CENTER.toUInt() or SS_NOTIFY.toUInt(),
                x + keymapTextWidth + 10, y + (textHeight - editHeight) / 2, 80, editHeight,
                container, k.buttonId.toLong().toCPointer(), instance, null
            )

            k.hwnd = edit
        }
    }

    updateScrollSize()
}

@OptIn(ExperimentalForeignApi::class)
fun updateScrollSize() {
    memScoped {
        val si = alloc<SCROLLINFO>().apply {
            cbSize = sizeOf<SCROLLINFO>().toUInt()
            fMask = SIF_ALL.toUInt()
            nMin = 0
        }

        GetScrollInfo(container, SB_VERT, si.ptr)

        si.nPos = si.nPos.coerceIn(0, keyMaps[selectedKeymap]?.keys?.size?.minus(9))
        si.nMax = keyMaps[selectedKeymap]?.keys?.size?.minus(1) ?: 9
        si.nPage = 9u

        SetScrollInfo(container, SB_VERT, si.ptr, TRUE)
    }
}

@OptIn(ExperimentalForeignApi::class)
fun keymapPageCommand(id: Int): Int {
    return when (id) {
        NEXT_BUTTON_ID -> {
            applyKeymap()
            0
        }

        BACK_BUTTON_ID -> {
            updateInstallCODMPageText()
            start(Steps.INSTALL_CODM)
            0
        }

        in 4001..4010 -> {
            if (keyMaps[id] != null) {
                selectedKeymap = id
                updateKeymapPageText()
                updatePageVisibility()
                updateScrollSize()
            }
            0
        }

        in 3001..3100 -> {
            val hwnd = keyMaps[selectedKeymap]?.keys?.find { it.buttonId == id }?.hwnd
            val oldHwnd = keyMaps[selectedKeymap]?.keys?.find { it.buttonId == activeEditId }?.hwnd

            SetFocus(hwnd)
            HideCaret(oldHwnd)
            DestroyCaret()

            CreateCaret(hwnd, null, 1, 14)
            SetCaretPos(38, 2)

            activeEditId = id

            SetWindowTextW(hwnd, null)
            ShowCaret(hwnd)

            SetFocus(hwndMain)
            0
        }

        else -> 0
    }
}

@OptIn(ExperimentalForeignApi::class)
fun languagePageCommand(id: Int): Int {
    return when (id) {
        EN_LANG_RADIO_ID -> {
            strings = en
            updateLangPageText()
            updatePageVisibility()
            reg?.let { setValue(it, lang, "en") }
            0
        }
        HU_LANG_RADIO_ID -> {
            strings = hu
            updateLangPageText()
            updatePageVisibility()
            reg?.let { setValue(it, lang, "hu") }
            0
        }
        NEXT_BUTTON_ID -> {
            updateLicensePageText()
            start(Steps.LICENSE)
            0
        }
        SKIP_BUTTON_ID -> {
            start(Steps.CODM_KEYMAP)
            0
        }
        else -> 0
    }
}

fun licensePageCommand(id: Int): Int {
    return when (id) {
        BACK_BUTTON_ID -> {
            updateLangPageText()
            start(Steps.SELECT_LANGUAGE)
            0
        }
        NEXT_BUTTON_ID -> {
            val androwsPath = "C:\\Program Files\\TxGameAssistant\\AppMarket\\AndrowsInstaller.exe"
            updateInstallAndrowsPageText(androwsPath.exists())
            start(Steps.ANDROWS_INSTALLER)
            0
        }
        SKIP_BUTTON_ID -> {
            start(Steps.CODM_KEYMAP)
            0
        }
        else -> 0
    }
}

fun installAndrowsPageCommand(id: Int): Int {
    val androwsPath = "C:\\Program Files\\TxGameAssistant\\AppMarket\\AndrowsInstaller.exe"
    val webpage = "https://sj.qq.com/download"
    val exist = androwsPath.exists()

    return when (id) {
        BACK_BUTTON_ID -> {
            updateLicensePageText()
            start(Steps.LICENSE)
            0
        }
        SKIP_BUTTON_ID -> {
            start(Steps.CODM_KEYMAP)
            0
        }
        NEXT_BUTTON_ID -> {
            updateDownloadCODMPageText()
            start(Steps.DOWNLOAD_CODM)
            0
        }
        OPEN_BUTTON_ID -> {
            if (exist) ConsoleManager.runPath(androwsPath)
            else ConsoleManager.runPath(webpage)
            0
        }
        GUIDE_BUTTON_ID -> {
            if (exist) openImage(androwsInstaller)
            else {
                openImage(website)
                openImage(androwsInstaller)
            }
            0
        }
        else -> 0
    }
}

fun downloadCODMPageCommand(id: Int): Int {
    return when (id) {
        BACK_BUTTON_ID -> {
            val androwsPath = "C:\\Program Files\\TxGameAssistant\\AppMarket\\AndrowsInstaller.exe"
            updateInstallAndrowsPageText(androwsPath.exists())
            start(Steps.ANDROWS_INSTALLER)
            0
        }
        SKIP_BUTTON_ID -> {
            start(Steps.CODM_KEYMAP)
            0
        }
        NEXT_BUTTON_ID -> {
            updateAddToWhiteListText()
            start(Steps.ADD_TO_WHITELIST)
            0
        }
        OPEN_BUTTON_ID -> {
            val webpage = "https://www.apkmirror.com/apk/activision-publishing-inc/call-of-duty-legends-of-war/call-of-duty-legends-of-war-1-0-52-release/call-of-duty-mobile-season-6-1-0-52-android-apk-download"
            ConsoleManager.runPath(webpage)
            0
        }
        GUIDE_BUTTON_ID -> {
            openImage(download_CODM)
            0
        }
        else -> 0
    }
}

fun addToWhiteListPageCommand(id: Int): Int {
    return when (id) {
        BACK_BUTTON_ID -> {
            updateDownloadCODMPageText()
            start(Steps.DOWNLOAD_CODM)
            0
        }
        SKIP_BUTTON_ID -> {
            start(Steps.CODM_KEYMAP)
            0
        }
        NEXT_BUTTON_ID -> {
            updateInstallFileManagerText()
            start(Steps.INSTALL_FILE_MANAGER)
            0
        }
        INSTALL_BUTTON_ID -> {
            start(Steps.LOADING)
            addCODMToWhiteList()
            start(Steps.ADD_TO_WHITELIST)
            0
        }
        else -> 0
    }
}

fun installFileManagerPageCommand(id: Int): Int {
    return when (id) {
        BACK_BUTTON_ID -> {
            updateAddToWhiteListText()
            start(Steps.ADD_TO_WHITELIST)
            0
        }
        SKIP_BUTTON_ID -> {
            start(Steps.CODM_KEYMAP)
            0
        }
        NEXT_BUTTON_ID -> {
            updateInstallCODMPageText()
            start(Steps.INSTALL_CODM)
            0
        }
        INSTALL_BUTTON_ID -> {
            openImage(installFileManager1)
            openImage(installFileManager2)
            openImage(installFileManager3)
            0
        }
        else -> 0
    }
}

fun installCODMPageCommand(id: Int): Int {
    return when (id) {
        BACK_BUTTON_ID -> {
            updateInstallFileManagerText()
            start(Steps.INSTALL_FILE_MANAGER)
            0
        }
        SKIP_BUTTON_ID -> {
            start(Steps.CODM_KEYMAP)
            0
        }
        NEXT_BUTTON_ID -> {
            start(Steps.CODM_KEYMAP)
            MessageBoxW(
                hWnd = hwndMain,
                lpText = strings[info],
                lpCaption = "Info",
                uType = MB_OK.toUInt()
            )
            0
        }
        OPEN_BUTTON_ID -> {
            start(Steps.LOADING)
            launchInstallCodm()
            start(Steps.INSTALL_CODM)
            0
        }
        GUIDE_BUTTON_ID -> {
            start(Steps.LOADING)
            createCodmIcon()
            start(Steps.INSTALL_CODM)
            0
        }
        else -> 0
    }
}

fun updateKeymapPageText() {
    keyMaps[selectedKeymap]?.keys?.forEach {
        SetWindowTextW(it.hwndText, strings[it.text].reduce(it.hwndText))
    }
    SetWindowTextW(nextButton, strings[apply])
}

fun updateInstallCODMPageText() {
    SetWindowTextW(title, strings[title_7])
    SetWindowTextW(nextButton, strings[next])
    SetWindowTextW(cancelButton, strings[cancel])
    SetWindowTextW(backButton, strings[back])
    SetWindowTextW(text3, strings[install_text])
    SetWindowTextW(openButton, strings[install])
    SetWindowTextW(guideButton, strings[icon])
}

fun updateAddToWhiteListText() {
    SetWindowTextW(title, strings[title_6])
    SetWindowTextW(nextButton, strings[next])
    SetWindowTextW(cancelButton, strings[cancel])
    SetWindowTextW(backButton, strings[back])
    SetWindowTextW(text3, strings[text_7])
    SetWindowTextW(installButton, strings[add])
}

fun updateInstallFileManagerText() {
    SetWindowTextW(title, strings[title_5])
    SetWindowTextW(nextButton, strings[next])
    SetWindowTextW(cancelButton, strings[cancel])
    SetWindowTextW(backButton, strings[back])
    SetWindowTextW(text3, strings[text_6])
    SetWindowTextW(installButton, strings[guide])
}

fun updateDownloadCODMPageText() {
    SetWindowTextW(title, strings[title_4])
    SetWindowTextW(nextButton, strings[next])
    SetWindowTextW(cancelButton, strings[cancel])
    SetWindowTextW(backButton, strings[back])
    SetWindowTextW(text3, strings[text_5])
    SetWindowTextW(openButton, strings[open])
    SetWindowTextW(guideButton, strings[guide])
}

fun updateInstallAndrowsPageText(installerFound: Boolean) {
    SetWindowTextW(title, strings[title_3])
    SetWindowTextW(nextButton, strings[next])
    SetWindowTextW(cancelButton, strings[cancel])
    SetWindowTextW(backButton, strings[back])
    if (installerFound) SetWindowTextW(text3, strings[text_3]) else SetWindowTextW(text3, strings[text_4])
    SetWindowTextW(openButton, strings[open])
    SetWindowTextW(guideButton, strings[guide])
}

fun updateLicensePageText() {
    SetWindowTextW(title, strings[title_2])
    SetWindowTextW(nextButton, strings[accept])
    SetWindowTextW(cancelButton, strings[cancel])
    SetWindowTextW(backButton, strings[back])
    SetWindowTextW(text2, license)
}

fun updateLangPageText() {
    SetWindowTextW(title, strings[welcome])
    SetWindowTextW(text1, strings[text_1])
    SetWindowTextW(text1_1, strings[text_1_1])
    SetWindowTextW(radio1, strings[lang_en])
    SetWindowTextW(radio2, strings[lang_hu])
    SetWindowTextW(nextButton, strings[next])
    SetWindowTextW(cancelButton, strings[cancel])
}