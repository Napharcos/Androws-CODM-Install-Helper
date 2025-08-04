@file:OptIn(ExperimentalForeignApi::class)

import kotlinx.cinterop.*
import resources.*

val androwsInstaller = getImageBinary(
    _binary_src_nativeMain_resources_androws_installer_png_start,
    _binary_src_nativeMain_resources_androws_installer_png_end
)

val installFileManager1 = getImageBinary(
    _binary_src_nativeMain_resources_install_file_manager_1_png_start,
    _binary_src_nativeMain_resources_install_file_manager_1_png_end
)

val installFileManager2 = getImageBinary(
    _binary_src_nativeMain_resources_install_file_manager_2_png_start,
    _binary_src_nativeMain_resources_install_file_manager_2_png_end
)

val installFileManager3 = getImageBinary(
    _binary_src_nativeMain_resources_install_file_manager_3_png_start,
    _binary_src_nativeMain_resources_install_file_manager_3_png_end
)

val website = getImageBinary(
    _binary_src_nativeMain_resources_website_png_start,
    _binary_src_nativeMain_resources_website_png_end
)

val download_CODM = getImageBinary(
    _binary_src_nativeMain_resources_download_codm_png_start,
    _binary_src_nativeMain_resources_download_codm_png_end
)

val codmIco = getImageBinary(
    _binary_src_nativeMain_resources_codm_ico_start,
    _binary_src_nativeMain_resources_codm_ico_end
)

private fun getImageBinary(start: CPointer<UByteVarOf<UByte>>, end: CPointer<UByteVarOf<UByte>>): ByteArray {
    val s = start.rawValue.toLong()
    val end = end.rawValue.toLong()
    val size = (end - s).toInt()

    val result = ByteArray(size)
    for (i in 0 until size) {
        result[i] = start[i].toByte()
    }

    return result
}