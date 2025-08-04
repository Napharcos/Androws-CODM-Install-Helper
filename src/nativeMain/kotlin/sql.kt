val UPDATE_SMK = """
    INSERT INTO configs (key, value, encrypt, json_data)
    VALUES ('androws.com.activision.callofduty.shooter.smk', '${SMK.trimIndent()}', 0, '') 
    ON CONFLICT(key) DO UPDATE SET value = excluded.value, encrypt = excluded.encrypt;
""".trimIndent()

val UPDATE_DEFAULT_KEYMAP = """
    INSERT INTO configs (key, value, encrypt, json_data)
    VALUES ('androws.com.activision.callofduty.shooter.default.key_mapping', '${DEFAULT_KEYMAP.trimIndent()}', 0, '') 
    ON CONFLICT(key) DO UPDATE SET value = excluded.value, encrypt = excluded.encrypt;
""".trimIndent()

const val CLEAR_KEYMAP_CONFIGS = """
DELETE FROM key_map_configs_cache_official
WHERE key LIKE '%activision%';
"""

val OFFICIAL_CONFIG2 = """
    INSERT INTO key_map_configs_cache_official (key, value0, value1, value2, value3, value4)
    VALUES ('offcial_config2.com.activision.callofduty.shooter', NULL, '${OFFICIAL_CONFIG2_VALUE1.trimIndent()}', '${OFFICIAL_CONFIG2_VALUE2.trimIndent()}', NULL, NULL) 
    ON CONFLICT(key) DO UPDATE SET value0 = excluded.value0;
""".trimIndent()

val LAST_MODE = """
    INSERT INTO key_map_configs_cache_official (key, value0, value1, value2, value3, value4)
    VALUES ('lastmodeid.unlogin.com.activision.callofduty.shooter', '145', '', NULL, NULL, NULL) 
    ON CONFLICT(key) DO UPDATE SET value0 = excluded.value0;
""".trimIndent()

val KEYMAP_145 = """
    INSERT INTO key_map_configs_cache_official (key, value0, value1, value2, value3, value4)
    VALUES ('keymap_mode.unlogin.com.activision.callofduty.shooter.145', '${KEYMAP_CONTENT_145.trimIndent()}', '', NULL, NULL, NULL) 
    ON CONFLICT(key) DO UPDATE SET value0 = excluded.value0;
""".trimIndent()

val KEYMAP_145_145 = """
    INSERT INTO key_map_configs_cache_official (key, value0, value1, value2, value3, value4)
    VALUES ('offcial_keymap_data2.com.activision.callofduty.shooter.145.145', '${KEYMAP_CONTENT_145_145.trimIndent()}', '15634', '', '', '') 
    ON CONFLICT(key) DO UPDATE SET value0 = excluded.value0;
""".trimIndent()

//gundam
var KEYMAP_145_566 = """
    INSERT INTO key_map_configs_cache_official (key, value0, value1, value2, value3, value4)
    VALUES ('offcial_keymap_data2.com.activision.callofduty.shooter.145.566632', '${KEYMAP_CONTENT_145_566.trimIndent()}', '17179', '', '', '') 
    ON CONFLICT(key) DO UPDATE SET value0 = excluded.value0;
""".trimIndent()

fun reinitGD(keys: List<KeyData>) {
    KEYMAP_145_566 = """
    INSERT INTO key_map_configs_cache_official (key, value0, value1, value2, value3, value4)
    VALUES ('offcial_keymap_data2.com.activision.callofduty.shooter.145.566632', '${KEYMAP_CONTENT_145_566.trimIndent().reMap(keys)}', '17179', '', '', '') 
    ON CONFLICT(key) DO UPDATE SET value0 = excluded.value0;
""".trimIndent()
}

//multi player
var KEYMAP_145_175 = """
    INSERT INTO key_map_configs_cache_official (key, value0, value1, value2, value3, value4)
    VALUES ('keymap_data.unlogin.com.activision.callofduty.shooter.145.1752061764155', '${KEYMAP_CONTENT_145_175.trimIndent()}', '', '', '', '') 
    ON CONFLICT(key) DO UPDATE SET value0 = excluded.value0;
""".trimIndent()

fun reinitMP(keys: List<KeyData>) {
    KEYMAP_145_175 = """
    INSERT INTO key_map_configs_cache_official (key, value0, value1, value2, value3, value4)
    VALUES ('keymap_data.unlogin.com.activision.callofduty.shooter.145.1752061764155', '${KEYMAP_CONTENT_145_175.trimIndent().reMap(keys)}', '', '', '', '') 
    ON CONFLICT(key) DO UPDATE SET value0 = excluded.value0;
""".trimIndent()
}

val KEYMAP_146 = """
    INSERT INTO key_map_configs_cache_official (key, value0, value1, value2, value3, value4)
    VALUES ('keymap_mode.unlogin.com.activision.callofduty.shooter.146', '${KEYMAP_CONTENT_146.trimIndent()}', '', NULL, NULL, NULL) 
    ON CONFLICT(key) DO UPDATE SET value0 = excluded.value0;
""".trimIndent()

val KEYMAP_146_146 = """
    INSERT INTO key_map_configs_cache_official (key, value0, value1, value2, value3, value4)
    VALUES ('offcial_keymap_data2.com.activision.callofduty.shooter.146.146', '${KEYMAP_CONTENT_146_146.trimIndent()}', '12417', NULL, NULL, NULL) 
    ON CONFLICT(key) DO UPDATE SET value0 = excluded.value0;
""".trimIndent()

//battle royale
var KEYMAP_146_175 = """
    INSERT INTO key_map_configs_cache_official (key, value0, value1, value2, value3, value4)
    VALUES ('keymap_data.unlogin.com.activision.callofduty.shooter.146.1752061764139', '${KEYMAP_CONTENT_146_175.trimIndent()}', '', '', '', '') 
    ON CONFLICT(key) DO UPDATE SET value0 = excluded.value0;
""".trimIndent()

fun reinitBR(keys: List<KeyData>) {
    KEYMAP_146_175 = """
    INSERT INTO key_map_configs_cache_official (key, value0, value1, value2, value3, value4)
    VALUES ('keymap_data.unlogin.com.activision.callofduty.shooter.146.1752061764139', '${KEYMAP_CONTENT_146_175.trimIndent().reMap(keys)}', '', '', '', '') 
    ON CONFLICT(key) DO UPDATE SET value0 = excluded.value0;
""".trimIndent()
}