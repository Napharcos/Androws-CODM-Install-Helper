import kotlinx.cinterop.ExperimentalForeignApi
import platform.windows.HWND

@OptIn(ExperimentalForeignApi::class)
enum class Steps(
    val elements: List<HWND?>,
    val clicked: (Int) -> Int
) {
    SELECT_LANGUAGE(
        elements = listOf(title, text1, text1_1, radio1, radio2, separator, skipButton, nextButton, cancelButton),
        clicked = { languagePageCommand(it) }
    ),

    LICENSE(
        elements = listOf(title, text2, separator, skipButton, backButton, nextButton, cancelButton),
        clicked = { licensePageCommand(it) }
    ),

    ANDROWS_INSTALLER(
        elements = listOf(title, text3, openButton, guideButton, separator, skipButton, backButton, nextButton, cancelButton),
        clicked = { installAndrowsPageCommand(it) }
    ),

    DOWNLOAD_CODM(
        elements = listOf(title, text3, openButton, guideButton, separator, skipButton, backButton, nextButton, cancelButton),
        clicked = { downloadCODMPageCommand(it) }
    ),

    ADD_TO_WHITELIST(
        elements = listOf(title, text3, installButton, separator, skipButton, backButton, nextButton, cancelButton),
        clicked = { addToWhiteListPageCommand(it) }
    ),

    LOADING(
        elements = listOf(title, text3, loading, separator, cancelButton),
        clicked = { 0 }
    ),

    INSTALL_FILE_MANAGER(
        elements = listOf(title, text3, installButton, separator, skipButton, backButton, nextButton, cancelButton),
        clicked = { installFileManagerPageCommand(it) }
    ),

    INSTALL_CODM(
        elements = listOf(title, text3, openButton, guideButton, separator, skipButton, backButton, nextButton, cancelButton),
        clicked = { installCODMPageCommand(it) }
    ),

    CODM_KEYMAP(
        elements = listOf(vSeparator, separator, container, helpButton, backButton, nextButton, cancelButton),
        clicked = { keymapPageCommand(it) }
    )
}