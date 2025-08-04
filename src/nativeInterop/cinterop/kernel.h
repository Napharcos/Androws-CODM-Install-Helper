// toolhelp_wrapper.h

#ifndef KERNEL_H
#define KERNEL_H

#include <windows.h>
#include <tlhelp32.h>

#ifdef __cplusplus
extern "C" {
#endif

// Wrapper: Létrehozza a process snapshotot
HANDLE my_CreateToolhelp32Snapshot(DWORD flags, DWORD pid);

// Wrapper: Lekéri az első folyamatot
BOOL my_Process32First(HANDLE snapshot, LPPROCESSENTRY32 entry);

// Wrapper: Lekéri a következő folyamatot
BOOL my_Process32Next(HANDLE snapshot, LPPROCESSENTRY32 entry);

// Wrapper: Bezár egy handle-t
BOOL my_CloseHandle(HANDLE h);

#ifdef __cplusplus
}
#endif

#endif