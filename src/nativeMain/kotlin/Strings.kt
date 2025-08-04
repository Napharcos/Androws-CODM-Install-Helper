import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.allocArray
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.toKString
import platform.windows.CheckRadioButton
import platform.windows.GetUserDefaultLocaleName
import platform.windows.WCHARVar

const val next = "next"
const val apply = "apply"
const val back = "back"
const val skip = "skip"
const val error = "error"
const val adding = "adding"
const val add = "add"
const val install = "install"
const val installing = "installing"
const val unpack = "unpack"
const val welcome = "welcome"
const val cancel = "cancel"
const val confirmation = "confirmation"
const val cancel_text = "cancel_text"
const val text_1 = "text_1"
const val text_1_1 = "text_1_1"
const val title_2 = "title_2"
const val lang = "lang"
const val accept = "accept"
const val title_3 = "title_3"
const val title_4 = "title_4"
const val title_5 = "title_5"
const val title_6 = "title_6"
const val title_7 = "title_7"
const val text_3 = "text_3"
const val text_4 = "text_4"
const val text_5 = "text_5"
const val text_6 = "text_6"
const val text_7 = "text_7"
const val open = "open"
const val guide = "guide"
const val install_text = "install_text"
const val install_failed = "install_failed"
const val error_unpack = "error_unpack"
const val error_detect = "error_detect"
const val icon = "icon"
const val mp_tab_key = "mp_tab_key"
const val mp_esc_key = "mp_esc_key"
const val mp_space_key = "mp_space_key"
const val gd_space_key = "gd_space_key"
const val mp_1_key = "mp_1_key"
const val mp_2_key = "mp_2_key"
const val mp_3_key = "mp_3_key"
const val mp_4_key = "mp_4_key"
const val mp_5_key = "mp_5_key"
const val mp_6_key = "mp_6_key"
const val mp_7_key = "mp_7_key"
const val mp_t_key = "mp_t_key"
const val mp_c_key = "mp_c_key"
const val mp_e_key = "mp_e_key"
const val mp_f_key = "mp_f_key"
const val mp_q_key = "mp_q_key"
const val mp_m_key = "mp_m_key"
const val mp_g_key = "mp_g_key"
const val mp_r_key = "mp_r_key"
const val mp_v_key = "mp_v_key"
const val mp_ctrl_key = "mp_ctrl_key"
const val gd_ctrl_key = "gd_ctrl_key"
const val mp_z_key = "mp_z_key"
const val mp_f4_key = "mp_f4_key"
const val mp_o_key = "mp_o_key"
const val mp_i_key = "mp_i_key"
const val mp_l_key = "mp_l_key"
const val mp_caps_key = "mp_caps_key"
const val gd_q_key = "gd_q_key"
const val gd_e_key = "gd_e_key"
const val gd_r_key = "gd_r_key"
const val lock_mouse_key = "lock_mouse_key"
const val br_tab_key = "br_tab_key"
const val br_space_key = "br_space_key"
const val br_b_key = "br_b_key"
const val br_c_key = "br_c_key"
const val br_o_key = "br_o_key"
const val br_e_key = "br_e_key"
const val br_g_key = "br_g_key"
const val br_f_key = "br_f_key"
const val br_t_key = "br_t_key"
const val br_h_key = "br_h_key"
const val br_q_key = "br_q_key"
const val br_r_key = "br_r_key"
const val br_v_key = "br_v_key"
const val br_ctrl_key = "br_ctrl_key"
const val br_caps_key = "br_caps_key"
const val br_alt_key = "br_alt_key"
const val br_3_key = "br_3_key"
const val br_4_key = "br_4_key"
const val info = "info"
const val lang_en = "lang_en"
const val lang_hu = "lang_hu"

val en = mapOf(
    next to "Next",
    apply to "Apply",
    back to "Back",
    skip to "Skip to keymap",
    error to "Error",
    cancel to "Cancel",
    welcome to "Welcome!",
    confirmation to "Confirmation",
    cancel_text to "Are you sure you want to close the application?",
    text_1 to "This application supports the installation and setup of Call of Duty Mobile on the Androws emulator using automated steps.",
    text_1_1 to "Choose a language to get started:",
    title_2 to "Terms of use",
    accept to "Accept",
    title_3 to "Installing Androws",
    title_7 to "Installing CODM",
    title_4 to "Download CODM",
    title_5 to "Start emulator",
    title_6 to "Allow",
    unpack to "Unpacking",
    open to "Open",
    guide to "Guide",
    text_3 to "This step will help you install the Androws emulator. To get started, press the \"Open\" button, which will launch the Androws installer. If you need help during this step, press the \"Guide\" button.",
    text_4 to "This step will help you install the Androws emulator. To get started, press the \"Open\" button, which will open the website, download the installer, and install the emulator. If you need help during this step, press the \"Guide\" button.",
    text_5 to "Now press the \"Open\" button, which will open a website, download CODM. If you need help during this step, press the \"Guide\" button.",
    text_6 to "To install CODM, you first need to start the emulator. To do this, you first need to install an app from the store, then open it. Due to its small size, I recommend a file manager. If you need help during this step, press the \"Guide\" button.",
    install_text to "The installation of CODM is about to begin. This is a fully automated step, so just click the \"Install\" button. If the desktop icon is not created automatically after installation, press the create icon button.",
    text_7 to "In this step, we will add CODM to the list of allowed applications. Press the \"Add\" button.",
    error_unpack to "The call of duty mobile apkm file is not found in the downloads folder. Please check if you actually downloaded it.",
    error_detect to "The emulator could not be detected. Please check if the emulator is actually running. You may want to try restarting your PC and trying again.",
    adding to "Adding",
    adding to "Add",
    install to "Install",
    installing to "Installing",
    install_failed to "CODM installation failed.",
    icon to "Creating icon",
    mp_tab_key to "Combat performance panel",
    mp_esc_key to "Menu",
    mp_space_key to "Jump/Drone up",
    gd_space_key to "Jump",
    mp_1_key to "Weapon 1",
    mp_2_key to "Weapon 2",
    mp_3_key to "Scorestreak 1",
    mp_4_key to "Scorestreak 2",
    mp_5_key to "Scorestreak 3",
    mp_6_key to "Scorestreak 4",
    mp_7_key to "Scorestreak 5",
    mp_t_key to "Detonate C4",
    mp_c_key to "Crouch/Slide",
    mp_e_key to "Operator skill",
    mp_f_key to "Plant - Defuse bomb/Cancel throwable/Pick up weapon/Open airdrop",
    mp_q_key to "Grenade/Tactical grenade",
    mp_m_key to "Map",
    mp_g_key to "Switch grenade/Lethal grenade",
    mp_r_key to "Reload",
    mp_v_key to "Knife",
    mp_ctrl_key to "Prone/Drone down",
    gd_ctrl_key to "Flight forward",
    mp_z_key to "Voice",
    mp_f4_key to "Emoji",
    mp_o_key to "Auto run/Night vision",
    br_o_key to "Auto run",
    mp_i_key to "Signal",
    mp_l_key to "Sound",
    mp_caps_key to "Execution",
    gd_q_key to "Ability 1",
    gd_e_key to "Ability 2",
    gd_r_key to "Ability 3",
    lock_mouse_key to "Lock mouse to screen",
    br_tab_key to "Backpack open/close",
    br_space_key to "Jump/Brake",
    br_caps_key to "Execution/Snowboard",
    br_b_key to "Change fire mode",
    br_c_key to "Crouch/Slide/Change position in car",
    br_e_key to "Skill/Aircraft jammer",
    br_g_key to "Revive/Pick up items",
    br_f_key to "Cancel grenade/Enter-exit car/Doors/Pick up item",
    br_t_key to "Open-Close loot box",
    br_h_key to "Pick up item/Open-Close loot box",
    br_q_key to "Enter car",
    br_r_key to "Reload",
    br_v_key to "1st/3rd person switch",
    br_ctrl_key to "Prone",
    br_alt_key to "Free view",
    br_3_key to "Grenade",
    br_4_key to "Armor",
    info to "Unfortunately, due to the changes, changing the key assignment within the emulator does not work, but it can be changed at any time with this application.",
    lang_en to "English - English",
    lang_hu to "Hungarian - Magyar"
)

val hu = mapOf(
    next to "Következő",
    apply to "Alkalmaz",
    back to "Vissza",
    skip to "Billentyűkiosztás",
    cancel to "Mégse",
    error to "Hiba",
    welcome to "Üdvözöljük!",
    confirmation to "Megerősítés",
    cancel_text to "Biztosan be szeretnéd zárni az alkalmazást?",
    text_1 to "Ez az alkalmazás automatizált lépések segítségével támogatja a Call of Duty Mobile telepítését és beállítását az Androws emulátoron.",
    text_1_1 to "A kezdéshez válasszon nyelvet:",
    title_2 to "Felhasználói feltételek",
    accept to "Elfogadom",
    title_3 to "Androws telepítése",
    title_4 to "CODM letöltése",
    title_5 to "Emulátor elindítása",
    title_6 to "Engedélyezés",
    unpack to "Kicsomagolás",
    open to "Megnyitás",
    guide to "Útmutató",
    title_3 to "Androws telepítése",
    title_7 to "CODM telepítése",
    text_3 to "Ez a lépés segít az Androws emulátor telepítésében. A kezdéshez nyomja meg a \"Megnyitás\" gombot, mely elindítja az Androws telepítőt. Ha segítségre van szüksége a lépés során nyomja meg az \"Útmutató\" gombot.",
    text_4 to "Ez a lépés segít az Androws emulátor telepítésében. A kezdéshez nyomja meg a \"Megnyitás\" gombot, mely megnyitja a weboldalt, töltse le a telepítőt és telepítse az emulátort. Ha segítségre van szüksége a lépés során nyomja meg az \"Útmutató\" gombot.",
    text_5 to "Most nyomja meg a \"Megnyitás\" gombot, mely megnyit egy weboldalt, töltse le a CODM-t. Ha segítségre van szüksége a lépés során nyomja meg az \"Útmutató\" gombot.",
    text_7 to "Ebben a lépésben hozzáadjuk a CODM-t az engedélyezett alkalmazások listájához. Nyomja meg a \"Hozzáadás\" gombot.",
    text_6 to "Ahoz hogy telepítsük a CODM-t először el kell índítani az emulátor-t. Ehez viszont először telepíteni kell egy app-ot a store-ból, majd megnyitni azt, a kis méret miatt egy fájlkezelőt javaslok. Ha segítségre van szüksége a lépés során nyomja meg az \"Útmutató\" gombot.",
    install_text to "A CODM telepítése következik. Ez egy teljesen automatizált lépés, így csak nyomja meg a \"Telepítés\" gombot. Ha telepítés után az asztali ikon nem jön létre magától, nyomjon az \"Ikon létrehozása\" gombra.",
    error_unpack to "A letöltések mappában nem található a call of duty mobile apkm fájlja. Ellenőrizze, valóban letöltötte-e.",
    error_detect to "Nem sikerült észlelni az emulátort. Kérjük ellenőrizze, valóban fut-e az emulátor. Esetleg próbálja újra indítani a pc-t és újrapróbálkozni.",
    adding to "Hozzáadás",
    add to "Hozzáadás",
    install to "Telepítés",
    installing to "Telepítés",
    install_failed to "A CODM telepítése sikertelen.",
    icon to "Ikon létrehozása",
    mp_tab_key to "Harc teljesítmény panel",
    mp_esc_key to "Menü",
    mp_space_key to "Ugrás/Drón fel",
    gd_space_key to "Ugrás",
    mp_1_key to "Fegyver 1",
    mp_2_key to "Fegyver 2",
    mp_3_key to "Scorestreak 1",
    mp_4_key to "Scorestreak 2",
    mp_5_key to "Scorestreak 3",
    mp_6_key to "Scorestreak 4",
    mp_7_key to "Scorestreak 5",
    mp_t_key to "C4 robbantás",
    mp_c_key to "Guggolás/Csúszás",
    mp_e_key to "Operator skill",
    mp_f_key to "Bomba telepítés-hatástalanítás/Mégse gránát/Fegyvercsere/Airdrop kinyitás",
    mp_q_key to "Gránát/Taktikai gránát",
    mp_m_key to "Térkép",
    mp_g_key to "Gránát csere/Halálos gránát",
    mp_r_key to "Újratöltés",
    mp_v_key to "Kés",
    mp_ctrl_key to "Fekvés/Drón le",
    gd_ctrl_key to "Repülés előre",
    mp_z_key to "Mikrofon",
    mp_f4_key to "Emoji",
    mp_o_key to "Auto futás/Éjjel látás",
    br_o_key to "Auto futás",
    mp_i_key to "Jelzés",
    mp_l_key to "Hang",
    mp_caps_key to "Kivégzés",
    gd_q_key to "Képesség 1",
    gd_e_key to "Képesség 2",
    gd_r_key to "Képesség 3",
    br_tab_key to "Táska kinyit/becsuk",
    br_space_key to "Ugrás/Fék",
    br_b_key to "Tüzelési mód módosítása",
    br_c_key to "Guggolás/Csúszás/Hely csere autóban",
    br_e_key to "Képesség/Rakéta hárítás",
    br_g_key to "Feléleszt/Elem felvétele",
    br_f_key to "Mégse gránát/Be-ki szállás autóból/Ajtók/Elem felvétele",
    br_t_key to "Láda nyitás-zárás",
    br_h_key to "Elem felvétele/Láda nyitás-zárás",
    br_q_key to "Be szállás autóba",
    br_r_key to "Újratöltés",
    br_v_key to "Belső/Külső nézet váltás",
    br_ctrl_key to "Fekvés",
    br_alt_key to "Szabad nézet",
    br_3_key to "Gránát",
    br_4_key to "Páncél",
    lock_mouse_key to "Kurzor rögzítése a képernyőhöz",
    info to "Sajnos a módosítások miatt a billentyű kiosztás emulátoron belül történő módosítása nem működik, de ezzel az alkalmazással bármikor módosítható.",
    lang_en to "Angol - English",
    lang_hu to "Magyar - Magyar",
)

lateinit var strings: Map<String, String>

fun initLanguage() {
    val langId = when (strings) {
        en -> EN_LANG_RADIO_ID
        hu -> HU_LANG_RADIO_ID
        else -> EN_LANG_RADIO_ID
    }
    CheckRadioButton(hwndMain, 2001, 2002, langId)
}

@OptIn(ExperimentalForeignApi::class)
fun initStrings(): Map<String, String> {
    val language = reg?.let { getValue(it, lang) } ?: getLocalLanguage()

    return when (language) {
        "hu" -> hu
        else -> en
    }
}

@OptIn(ExperimentalForeignApi::class)
fun getLocalLanguage(): String {
    val bufferSize = 85
    val buffer = nativeHeap.allocArray<WCHARVar>(bufferSize)
    val length = GetUserDefaultLocaleName(buffer, bufferSize)

    return if (length > 0) {
        val langName = buffer.toKString()
        langName.substringBefore('-')
    } else {
        "en"
    }.also {
        nativeHeap.free(buffer.rawValue)
    }
}

const val license =
    "Copyright 2025 Napharcos. All rights reserved.\r\n\r\nPermission is granted to use this software for personal," +
            " non-commercial purposes only.\r\nAny form of copying, distribution, modification, reverse engineering," +
            " or creation of derivative works is strictly prohibited without the express written consent of the author, " +
            "unless otherwise explicitly stated.\r\n\r\nThe source code is made publicly available for transparency and " +
            "to promote trust, not for reuse or redistribution.\r\nViewing or running the source code does not imply " +
            "permission to reuse or incorporate it elsewhere.\r\n\r\nFor any commercial, educational, or redistributive use, " +
            "please contact the author directly for explicit permission.\r\n\r\n\r\nThis software and its components are " +
            "provided \"as is\", without any warranties, express or implied, including but not limited to merchantability " +
            "or fitness for a particular purpose.\r\nUse at your own risk.\r\n\r\nThis software is not affiliated with, " +
            "endorsed by, or supported by the original software developers or publishers, including but not limited to " +
            "Tencent, Activision, or their affiliates.\r\nAny use of associated configurations or automations is done " +
            "at your own risk. The author assumes no responsibility for any resulting issues or damages."