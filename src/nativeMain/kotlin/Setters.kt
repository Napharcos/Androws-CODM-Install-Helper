import kotlinx.cinterop.*
import platform.posix.F_OK
import platform.posix.access
import platform.windows.*

fun String.exists(): Boolean {
    return access(this, F_OK) == 0
}

@OptIn(ExperimentalForeignApi::class)
fun String?.reduce(hwnd: HWND?): String? {
    return this?.let {
        val hdc = GetDC(hwnd)
        val words = it.split(Regex("\\s+"))
        val spaceWidth: Int
        var lineCount = 1
        var lineWidth = 0
        var result = ""

        memScoped {
            val size = alloc<SIZE>()
            GetTextExtentPoint32W(hdc, " ", 1, size.ptr)
            spaceWidth = size.cx

            for (word in words) {
                val wordWithSpace = "$word "
                GetTextExtentPoint32W(hdc, wordWithSpace, wordWithSpace.length, size.ptr)
                val wordWidth = size.cx

                if (lineWidth + wordWidth > keymapTextWidth) {
                    lineCount++
                    if (lineCount > 2) {
                        result = result.trimEnd() + "..."
                        break
                    }
                    lineWidth = 0
                }

                lineWidth += wordWidth
                result += wordWithSpace
            }
        }

        ReleaseDC(hwnd, hdc)
        return result.trimEnd()
    }
}

@OptIn(ExperimentalForeignApi::class)
fun String.isSingleLine(hwnd: HWND?): Boolean {
    return this.let {
        val hdc = GetDC(hwnd)
        var currentLineWidth = 0
        var charCount = 0

        memScoped {
            val size = alloc<SIZE>()

            for (char in it) {
                val s = "$char"
                GetTextExtentPoint32W(hdc, s, 1, size.ptr)
                currentLineWidth += size.cx

                if (currentLineWidth > keymapTextWidth) break

                charCount++
            }
        }

        ReleaseDC(hwnd, hdc)
        charCount >= it.length
    }
}

fun Int.keyCodeToName(): String? {
    return when (this) {
        VK_UP -> "UP"
        VK_DOWN -> "DOWN"
        VK_LEFT -> "LEFT"
        VK_RIGHT -> "RIGHT"
        VK_CONTROL -> "CTRL"
        VK_END -> "END"
        VK_HOME -> "HOME"
        VK_ESCAPE -> "ESC"
        VK_F1 -> "F1"
        VK_F2 -> "F2"
        VK_F3 -> "F3"
        VK_F4 -> "F4"
        VK_F5 -> "F5"
        VK_F6 -> "F6"
        VK_F7 -> "F7"
        VK_F8 -> "F8"
        VK_F9 -> "F9"
        VK_F10 -> "F10"
        VK_F11 -> "F11"
        VK_F12 -> "F12"
        VK_LWIN -> "WIN"
        VK_RETURN -> "ENTER"
        VK_NUMPAD0 -> "NUMPAD0"
        VK_NUMPAD1 -> "NUMPAD1"
        VK_NUMPAD2 -> "NUMPAD2"
        VK_NUMPAD3 -> "NUMPAD3"
        VK_NUMPAD4 -> "NUMPAD4"
        VK_NUMPAD5 -> "NUMPAD5"
        VK_NUMPAD6 -> "NUMPAD6"
        VK_NUMPAD7 -> "NUMPAD7"
        VK_NUMPAD8 -> "NUMPAD8"
        VK_NUMPAD9 -> "NUMPAD9"
        VK_TAB  -> "TAB"
        VK_SPACE -> "SPACE"
        VK_CAPITAL -> "CAPS"
        VK_DELETE -> "DELETE"
        VK_MENU -> "ALT"
        else -> null
    }
}

fun String.reMap(keys: List<KeyData>): String {
    var newText = this

    keys.forEach {
        newText = newText.replace(('%' + it.id.substringBefore(key) + name), it.currentKey)
        newText = newText.replace(('%' + it.id.substringBefore(key) + CODE), it.currentCode.toString())
    }

    return newText
}