@file:OptIn(ExperimentalForeignApi::class)

import kotlinx.cinterop.ExperimentalForeignApi
import platform.windows.EnableWindow
import platform.windows.FALSE
import platform.windows.HWND
import platform.windows.SetWindowTextW
import platform.windows.TRUE

const val GD = "gd"
const val BR = "br"
const val MP = "mp"

val mpKeys = mutableListOf(
    KeyData(tabKey, mp_tab_key, loadMpKey(tabKey) ?: "TAB", loadMpKeyCode(tabKey) ?: 9, 3001),
    KeyData(escKey, mp_esc_key, loadMpKey(escKey) ?: "ESC", loadMpKeyCode(escKey) ?: 27, 3002),
    KeyData(spaceKey, mp_space_key, loadMpKey(spaceKey) ?: "SPACE", loadMpKeyCode(spaceKey) ?: 32, 3003),
    KeyData(key1, mp_1_key, loadMpKey(key1) ?: "1", loadMpKeyCode(key1) ?: 49, 3004),
    KeyData(key2, mp_2_key, loadMpKey(key2) ?: "2", loadMpKeyCode(key2) ?: 50, 3005),
    KeyData(key3, mp_3_key, loadMpKey(key3) ?: "3", loadMpKeyCode(key3) ?: 51, 3006),
    KeyData(key4, mp_4_key, loadMpKey(key4) ?: "4", loadMpKeyCode(key4) ?: 52, 3007),
    KeyData(key5, mp_5_key, loadMpKey(key5) ?: "5", loadMpKeyCode(key5) ?: 53, 3008),
    KeyData(key6, mp_6_key, loadMpKey(key6) ?: "6", loadMpKeyCode(key6) ?: 54, 3009),
    KeyData(key7, mp_7_key, loadMpKey(key7) ?: "7", loadMpKeyCode(key7) ?: 55, 3010),
    KeyData(tKey, mp_t_key, loadMpKey(tKey) ?: "T", loadMpKeyCode(tKey) ?: 84, 3011),
    KeyData(cKey, mp_c_key, loadMpKey(cKey) ?: "C", loadMpKeyCode(cKey) ?: 67, 3012),
    KeyData(eKey, mp_e_key, loadMpKey(eKey) ?: "E", loadMpKeyCode(eKey) ?: 69, 3013),
    KeyData(fKey, mp_f_key, loadMpKey(fKey) ?: "F", loadMpKeyCode(fKey) ?: 70, 3014),
    KeyData(qKey, mp_q_key, loadMpKey(qKey) ?: "Q", loadMpKeyCode(qKey) ?: 81, 3015),
    KeyData(mKey, mp_m_key, loadMpKey(mKey) ?: "M", loadMpKeyCode(mKey) ?: 77, 3016),
    KeyData(gKey, mp_g_key, loadMpKey(gKey) ?: "G", loadMpKeyCode(gKey) ?: 71, 3017),
    KeyData(rKey, mp_r_key, loadMpKey(rKey) ?: "R", loadMpKeyCode(rKey) ?: 82, 3018),
    KeyData(vKey, mp_v_key, loadMpKey(vKey) ?: "V", loadMpKeyCode(vKey) ?: 86, 3019),
    KeyData(ctrlKey, mp_ctrl_key, loadMpKey(ctrlKey) ?: "CTRL", loadMpKeyCode(ctrlKey) ?: 17, 3020),
    KeyData(zKey, mp_z_key, loadMpKey(zKey) ?: "Z", loadMpKeyCode(zKey) ?: 90, 3021),
    KeyData(f4Key, mp_f4_key, loadMpKey(f4Key) ?: "F4", loadMpKeyCode(f4Key) ?: 115, 3022),
    KeyData(oKey, mp_o_key, loadMpKey(oKey) ?: "Ó", loadMpKeyCode(oKey) ?: 187, 3023),
    KeyData(iKey, mp_i_key, loadMpKey(iKey) ?: "Í", loadMpKeyCode(iKey) ?: 226, 3024),
    KeyData(lKey, mp_l_key, loadMpKey(lKey) ?: "L", loadMpKeyCode(lKey) ?: 76, 3025),
    KeyData(capsKey, mp_caps_key, loadMpKey(capsKey) ?: "CAPS", loadMpKeyCode(capsKey) ?: 20, 3026),
    KeyData(lockMouseKey, lock_mouse_key, loadMpKey(lockMouseKey) ?: "X", loadMpKeyCode(lockMouseKey) ?: 88, 3027),
)

val brKeys = mutableListOf(
    KeyData(tabKey, br_tab_key, loadBrKey(tabKey) ?: "TAB", loadBrKeyCode(tabKey) ?: 9, 3001),
    KeyData(capsKey, mp_caps_key, loadBrKey(capsKey) ?: "CAPS", loadBrKeyCode(capsKey) ?: 20, 3002),
    KeyData(escKey, mp_esc_key, loadBrKey(escKey) ?: "ESC", loadBrKeyCode(escKey) ?: 27, 3003),
    KeyData(spaceKey, br_space_key, loadBrKey(spaceKey) ?: "SPACE", loadBrKeyCode(spaceKey) ?: 32, 3004),
    KeyData(key1, mp_1_key, loadBrKey(key1) ?: "1", loadBrKeyCode(key1) ?: 49, 3005),
    KeyData(key2, mp_2_key, loadBrKey(key2) ?: "2", loadBrKeyCode(key2) ?: 50, 3006),
    KeyData(bKey, br_b_key, loadBrKey(bKey) ?: "B", loadBrKeyCode(bKey) ?: 66, 3007),
    KeyData(cKey, br_c_key, loadBrKey(cKey) ?: "C", loadBrKeyCode(cKey) ?: 67, 3008),
    KeyData(eKey, br_e_key, loadBrKey(eKey) ?: "E", loadBrKeyCode(eKey) ?: 69, 3009),
    KeyData(fKey, br_f_key, loadBrKey(fKey) ?: "F", loadBrKeyCode(fKey) ?: 70, 3010),
    KeyData(tKey, br_t_key, loadBrKey(tKey) ?: "T", loadBrKeyCode(tKey) ?: 84, 3011),
    KeyData(gKey, br_g_key, loadBrKey(gKey) ?: "G", loadBrKeyCode(gKey) ?: 71, 3012),
    KeyData(hKey, br_h_key, loadBrKey(hKey) ?: "H", loadBrKeyCode(hKey) ?: 72, 3013),
    KeyData(mKey, mp_m_key, loadBrKey(mKey) ?: "M", loadBrKeyCode(mKey) ?: 77, 3014),
    KeyData(qKey, br_q_key, loadBrKey(qKey) ?: "Q", loadBrKeyCode(qKey) ?: 81, 3015),
    KeyData(rKey, br_r_key, loadBrKey(rKey) ?: "R", loadBrKeyCode(rKey) ?: 82, 3016),
    KeyData(vKey, br_v_key, loadBrKey(vKey) ?: "V", loadBrKeyCode(vKey) ?: 86, 3017),
    KeyData(ctrlKey, br_ctrl_key, loadBrKey(ctrlKey) ?: "CTRL", loadBrKeyCode(ctrlKey) ?: 17, 3018),
    KeyData(zKey, mp_z_key, loadBrKey(zKey) ?: "Z", loadBrKeyCode(zKey) ?: 90, 3019),
    KeyData(f4Key, mp_f4_key, loadBrKey(f4Key) ?: "F4", loadBrKeyCode(f4Key) ?: 115, 3020),
    KeyData(oKey, br_o_key, loadBrKey(oKey) ?: "Ó", loadBrKeyCode(oKey) ?: 187, 3021),
    KeyData(altKey, mp_f4_key, loadBrKey(altKey) ?: "ALT", loadBrKeyCode(altKey) ?: 18, 3022),
    KeyData(iKey, mp_i_key, loadBrKey(iKey) ?: "Í", loadBrKeyCode(iKey) ?: 226, 3023),
    KeyData(kKey, mp_l_key, loadBrKey(kKey) ?: "K", loadBrKeyCode(kKey) ?: 75, 3024),
    KeyData(key3, br_3_key, loadBrKey(key3) ?: "3", loadBrKeyCode(key3) ?: 51, 3025),
    KeyData(key4, br_4_key, loadBrKey(key4) ?: "4", loadBrKeyCode(key4) ?: 52, 3026),
    KeyData(nKey, br_n_key, loadBrKey(nKey) ?: "N", loadBrKeyCode(nKey) ?: 78, 3027),
    KeyData(lockMouseKey, lock_mouse_key, loadBrKey(lockMouseKey) ?: "X", loadBrKeyCode(lockMouseKey) ?: 88, 3028),
)

val gundamKeys = mutableListOf(
    KeyData(tabKey, mp_tab_key, loadGdKey(tabKey) ?: "TAB", loadGdKeyCode(tabKey) ?: 9, 3001),
    KeyData(escKey, mp_esc_key, loadGdKey(escKey) ?: "ESC", loadGdKeyCode(escKey) ?: 27, 3002),
    KeyData(spaceKey, gd_space_key, loadGdKey(spaceKey) ?: "SPACE", loadGdKeyCode(spaceKey) ?: 32, 3003),
    KeyData(qKey, gd_q_key, loadGdKey(qKey) ?: "Q", loadGdKeyCode(qKey) ?: 81, 3004),
    KeyData(eKey, gd_e_key, loadGdKey(eKey) ?: "E", loadGdKeyCode(eKey) ?: 69, 3005),
    KeyData(rKey, gd_r_key, loadGdKey(rKey) ?: "R", loadGdKeyCode(rKey) ?: 82, 3006),
    KeyData(mKey, mp_m_key, loadGdKey(mKey) ?: "M", loadGdKeyCode(mKey) ?: 77, 3007),
    KeyData(ctrlKey, gd_ctrl_key, loadGdKey(ctrlKey) ?: "CTRL", loadGdKeyCode(ctrlKey) ?: 17, 3008),
    KeyData(iKey, mp_i_key, loadGdKey(iKey) ?: "Í", loadGdKeyCode(iKey) ?: 226, 3009),
    KeyData(tKey, mp_l_key, loadGdKey(tKey) ?: "T", loadGdKeyCode(tKey) ?: 84, 3010),
    KeyData(zKey, mp_z_key, loadGdKey(zKey) ?: "Z", loadGdKeyCode(zKey) ?: 89, 3011),
    KeyData(lockMouseKey, lock_mouse_key, loadGdKey(lockMouseKey) ?: "X", loadGdKeyCode(lockMouseKey) ?: 88, 3012),
)

val keyMaps = mutableMapOf<Int, KeyMaps>(
    4001 to KeyMaps("Multi Player", MP, mpKeys),
    4002 to KeyMaps("Battle Royale", BR, brKeys),
    4003 to KeyMaps("Gundam", GD, gundamKeys)
)

fun loadGdKeyCode(id: String) = reg?.let { getValue(it, GD + id + code) }?.toInt()

fun loadMpKeyCode(id: String) = reg?.let { getValue(it, MP + id + code) }?.toInt()

fun loadBrKeyCode(id: String) = reg?.let { getValue(it, BR + id + code) }?.toInt()

fun loadMpKey(id: String) = reg?.let { getValue(it, MP + id) }

fun loadBrKey(id: String) = reg?.let { getValue(it, BR + id) }

fun loadGdKey(id: String) = reg?.let { getValue(it, GD + id) }

fun applyKeymap() {
    reinitMP(keyMaps[4001]?.keys ?: emptyList())
    reinitBR(keyMaps[4002]?.keys ?: emptyList())
    reinitGD(keyMaps[4003]?.keys ?: emptyList())
    ConsoleManager.stopEmulator()
    DatabaseManager.launchUpdateDb()
}

fun updateKeyCode(id: String, keyCode: Int) {
    val keyMap = keyMaps[selectedKeymap]
    val mode = keyMap?.mode
    val element = keyMap?.keys?.firstOrNull { it.id == id }

    if (element?.currentCode == keyCode) return

    removeKey(keyCode)

    element?.let {
        it.currentCode = keyCode

        reg?.let { setValue(it, mode + id + code, keyCode.toString()) }
    }

    updateSubmitButtonState(nextButton)
}

fun updateKey(id: String, key: String) {
    val keyMap = keyMaps[selectedKeymap]
    val mode = keyMap?.mode
    val element = keyMap?.keys?.firstOrNull { it.id == id }

    element?.let {
        it.currentKey = key

        reg?.let { setValue(it, mode + id, key) }
    }
}

fun removeKey(keyCode: Int) {
    val keymap = keyMaps[selectedKeymap]
    val mode = keymap?.mode
    val filterElement = keymap?.keys?.firstOrNull { it.currentCode == keyCode }

    filterElement?.let {
        it.currentCode = -1
        it.currentKey = ""

        SetWindowTextW(it.hwnd, "")


        reg?.let {
            setValue(it, mode + filterElement.id + code, (-1).toString())
            setValue(it, mode + filterElement.id, "")
        }
    }
}

fun updateSubmitButtonState(button: HWND?) {
    var enabled = true

    for ((_, v) in keyMaps) {
        if (enabled == false) break
        enabled = v.keys.all { it.currentCode >= 0 }
    }

    EnableWindow(button, if (enabled) TRUE else FALSE)
}

var selectedKeymap = 4001

data class KeyMaps(
    val name: String,
    val mode: String,
    val keys: MutableList<KeyData> = mutableListOf(),
    var hwnd: HWND? = null,
)

data class KeyData(
    val id: String,
    val text: String,
    var currentKey: String,
    var currentCode: Int,
    val buttonId: Int,
    var hwndText: HWND? = null,
    var hwnd: HWND? = null
)

const val code = "code"
const val name = "Name"
const val key = "Key"
const val CODE = "Code"

const val tabKey = "tabKey"
const val escKey = "escKey"
const val spaceKey = "spaceKey"
const val key1 = "1Key"
const val key2 = "2Key"
const val key3 = "3Key"
const val key4 = "4Key"
const val key5 = "5Key"
const val key6 = "6Key"
const val key7 = "7Key"
const val tKey = "tKey"
const val cKey = "cKey"
const val eKey = "eKey"
const val fKey = "fKey"
const val qKey = "qKey"
const val mKey = "mKey"
const val hKey = "hKey"
const val gKey = "gKey"
const val rKey = "rKey"
const val vKey = "vKey"
const val ctrlKey = "ctrlKey"
const val zKey = "zKey"
const val f4Key = "f4Key"
const val oKey = "oKey"
const val iKey = "iKey"
const val lKey = "lKey"
const val kKey = "kKey"
const val bKey = "bKey"
const val nKey = "nKey"
const val altKey = "altKey"
const val lockMouseKey = "lockMouseKey"
const val capsKey = "capsKey"