import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toKString
import platform.windows.FOLDERID_RoamingAppData
import sqlite.sqlite3_get_config_value
import sqlite.sqlite_close
import sqlite.sqlite_exec
import sqlite.sqlite_open

@OptIn(ExperimentalForeignApi::class)
object DatabaseManager {

    private var db: COpaquePointer? = null

    private val dbPath = "${ConsoleManager.getSpecificPath(FOLDERID_RoamingAppData)}\\Tencent\\Androws\\db\\Configs.db"

    fun launchUpdateDb() {
        if (db == null) db = sqlite_open(dbPath)

        removeConfigTriggers()
        updateSMK()
        updateDefKeymap()
        updateLocalConfig()
        addConfigTriggers()
        removeKeymapTriggers()
        clearKeymapConfigs()
        addAllKeymapConfig()
        addKeymapTriggers()
        closeDb()
    }

    fun addAllKeymapConfig() {
        if (db == null) { db = sqlite_open(dbPath) }

        db?.let {
            sqlite_exec(it, OFFICIAL_CONFIG2)
            sqlite_exec(it, LAST_MODE)
            sqlite_exec(it, KEYMAP_145)
            sqlite_exec(it, KEYMAP_145_145)
            sqlite_exec(it, KEYMAP_145_566)
            sqlite_exec(it, KEYMAP_145_175)
            sqlite_exec(it, KEYMAP_146)
            sqlite_exec(it, KEYMAP_146_146)
            sqlite_exec(it, KEYMAP_146_175)
        }
    }

    fun clearKeymapConfigs() {
        if (db == null) db = sqlite_open(dbPath)

        db?.let { sqlite_exec(it, CLEAR_KEYMAP_CONFIGS) }
    }

    fun updateLocalConfig() {
        if (db == null) db = sqlite_open(dbPath)

        db?.let {
            val value = sqlite3_get_config_value(db, "androws.com.activision.callofduty.shooter.local_user_config")

            if (value == null) return

            val text = value.toKString()
            var newText = text

            if (text.contains("\"frame_rate\": ")) {
                val frameRate = text.substringAfter("\"frame_rate\": ").substringBefore(',')
                newText.replace("\"frame_rate\": $frameRate", "\"frame_rate\": 120")
            } else {
                val clarity = text.substringAfter("\"clarity\": ").substringBefore(',')
                newText.replace("\"clarity\": $clarity", "\"clarity\": $clarity, \"frame_rate\": 120")
            }
            if (text.contains("\"hide_full_screen_topbar\": ")) {
                val hide = text.substringAfter("\"hide_full_screen_topbar\": ").substringBefore(',')
                newText.replace("\"hide_full_screen_topbar\": $hide", "\"hide_full_screen_topbar\": true")
            } else {
                newText.replace("\"frame_rate\": 120", "\"hide_full_screen_topbar\": true")
            }

            sqlite_exec(db, """
                INSERT INTO configs (key, value)
                VALUES ('androws.com.activision.callofduty.shooter.local_user_config', '$newText') 
                ON CONFLICT(key) DO UPDATE SET value = excluded.value;
            """.trimIndent())
        }
    }

    fun updateSMK() {
        if (db == null) db = sqlite_open(dbPath)

        db?.let { sqlite_exec(it, UPDATE_SMK) }
    }

    fun updateDefKeymap() {
        if (db == null) db = sqlite_open(dbPath)

        db?.let { sqlite_exec(it, UPDATE_DEFAULT_KEYMAP) }
    }

    fun addConfigTriggers() {
        if (db == null) db = sqlite_open(dbPath)

        db?.let { sqlite_exec(it, ADD_CONFIG_TRIGGERS) }
    }

    fun removeConfigTriggers() {
        if (db == null) db = sqlite_open(dbPath)

        db?.let { sqlite_exec(it, REMOVE_CONFIG_TRIGGERS) }
    }

    fun addKeymapTriggers() {
        if (db == null) db = sqlite_open(dbPath)

        db?.let { sqlite_exec(it, ADD_KEYMAP_TRIGGERS) }
    }

    fun removeKeymapTriggers() {
        if (db == null) db = sqlite_open(dbPath)

        db?.let { sqlite_exec(it, REMOVE_KEYMAP_TRIGGERS) }
    }

    fun closeDb() {
        db?.let { sqlite_close(it) }
    }
}