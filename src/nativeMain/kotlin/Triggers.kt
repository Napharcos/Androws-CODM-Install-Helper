const val ADD_CONFIG_TRIGGERS = """
CREATE TRIGGER prevent_delete_of_protected_keys
BEFORE DELETE ON configs
FOR EACH ROW
WHEN OLD.key IN (
    'androws.com.activision.callofduty.shooter.smk',
    'androws.com.activision.callofduty.shooter.default.key_mapping'
)
BEGIN
    SELECT RAISE(FAIL, 'Ez a bejegyzés nem törölhető.');
END;

CREATE TRIGGER prevent_insert_override_of_protected_keys
BEFORE INSERT ON configs
FOR EACH ROW
WHEN NEW.key IN (
    'androws.com.activision.callofduty.shooter.smk',
    'androws.com.activision.callofduty.shooter.default.key_mapping'
)
AND EXISTS (
    SELECT 1 FROM configs
    WHERE key = NEW.key
)
BEGIN
    SELECT RAISE(FAIL, 'Ez a kulcs már létezik, nem lehet felülírni.');
END;

CREATE TRIGGER prevent_update_of_value_for_specific_keys
BEFORE UPDATE ON configs
FOR EACH ROW
WHEN 
    (NEW.key IN (
        'androws.com.activision.callofduty.shooter.smk',
        'androws.com.activision.callofduty.shooter.default.key_mapping'))
    AND NEW.value <> OLD.value
BEGIN
    SELECT RAISE(FAIL, 'A value mező nem módosítható ezeknél a key értékeknél.');
END;
"""

const val REMOVE_CONFIG_TRIGGERS = """
DROP TRIGGER IF EXISTS prevent_delete_of_protected_keys;
DROP TRIGGER IF EXISTS prevent_insert_override_of_protected_keys;
DROP TRIGGER IF EXISTS prevent_update_of_value_for_specific_keys;
"""

const val ADD_KEYMAP_TRIGGERS = """
CREATE TRIGGER prevent_delete_of_offcial_config
BEFORE DELETE ON key_map_configs_cache_official
FOR EACH ROW
WHEN OLD.key IN (
    'offcial_config2.com.activision.callofduty.shooter'
)
BEGIN
    SELECT RAISE(FAIL, 'Ez a bejegyzés nem törölhető.');
END;

CREATE TRIGGER prevent_insert_override_of_offcial_config
BEFORE INSERT ON key_map_configs_cache_official
FOR EACH ROW
WHEN NEW.key IN (
    'offcial_config2.com.activision.callofduty.shooter'
)
AND EXISTS (
    SELECT 1 FROM key_map_configs_cache_official
    WHERE key = NEW.key
)
BEGIN
    SELECT RAISE(FAIL, 'Ez a kulcs már létezik, nem lehet felülírni.');
END;

CREATE TRIGGER prevent_update_of_value_for_offcial_config
BEFORE UPDATE ON key_map_configs_cache_official
FOR EACH ROW
WHEN 
    (NEW.key IN (
        'offcial_config2.com.activision.callofduty.shooter'))
    AND (NEW.value0 <> OLD.value0 OR NEW.value2 <> OLD.value2 OR NEW.value1 <> OLD.value1)
BEGIN
    SELECT RAISE(FAIL, 'A value mező nem módosítható ezeknél a key értékeknél.');
END;
"""

const val REMOVE_KEYMAP_TRIGGERS = """
DROP TRIGGER IF EXISTS prevent_delete_of_offcial_config;
DROP TRIGGER IF EXISTS prevent_insert_override_of_offcial_config;
DROP TRIGGER IF EXISTS prevent_update_of_value_for_offcial_config;
"""