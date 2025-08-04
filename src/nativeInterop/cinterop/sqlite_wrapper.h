#ifndef SQLITE_WRAPPER_H
#define SQLITE_WRAPPER_H

#ifdef __cplusplus
extern "C" {
#endif

void* sqlite_open(const char* path);
void sqlite_close(void* dbPtr);
int sqlite_exec(void* dbPtr, const char* sql);
const char* sqlite3_get_config_value(void* db, const char* key);

#ifdef __cplusplus
}
#endif

#endif