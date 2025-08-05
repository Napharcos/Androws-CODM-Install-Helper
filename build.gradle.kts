plugins {
    alias(libs.plugins.kotlinMultiplatform)
}

group = "org.napharcos"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    mingwX64("native").apply {
        compilations.getByName("main") {

            cinterops {
                val resources by creating {
                    definitionFile.set(project.file("src/nativeInterop/cinterop/resources.def"))
                    packageName("resources")
                    compilerOpts("-Isrc/nativeInterop/cinterop")
                    includeDirs.allHeaders("src/nativeInterop/cinterop")
                }
                val sqlite by creating {
                    definitionFile.set(project.file("src/nativeInterop/cinterop/sqlite.def"))
                    packageName("sqlite")
                    compilerOpts("-Isrc/nativeInterop/cinterop")
                    includeDirs.allHeaders("src/nativeInterop/cinterop")
                }
                val kernel by creating {
                    definitionFile.set(project.file("src/nativeInterop/cinterop/kernel.def"))
                    packageName("kernel")
                    compilerOpts("-Isrc/nativeInterop/cinterop")
                    includeDirs.allHeaders("src/nativeInterop/cinterop")
                }
            }
        }

        binaries {
            executable {
                entryPoint = "main"
                linkerOpts("-static", "-Wl,-subsystem,windows", "-static-libstdc++")
            }
        }
    }

    sourceSets {
        nativeMain.dependencies {
            implementation(libs.kotlinx.coroutines)
        }
    }
}

tasks.named("linkDebugExecutableNative") {
    finalizedBy(regManifest)
}

tasks.named("linkReleaseExecutableNative") {
    finalizedBy(regReleaseManifest)
}

val regManifest by tasks.registering {
    doLast {
        val manifestFile = file("src/nativeMain/resources/app.manifest")
        val exeFile = file("build/bin/native/debugExecutable/AndrowsCODMInstallHelper.exe")
        val mt = "C:\\Program Files (x86)\\Windows Kits\\10\\bin\\10.0.20348.0\\x64\\mt.exe"

        project.exec {
            commandLine(mt, "-manifest", manifestFile.absolutePath, "-outputresource:${exeFile.absolutePath};#1" )
        }
    }
}

val regReleaseManifest by tasks.registering {
    doLast {
        val manifestFile = file("src/nativeMain/resources/app.manifest")
        val exeFile = file("build/bin/native/releaseExecutable/AndrowsCODMInstallHelper.exe")
        val mt = "C:\\Program Files (x86)\\Windows Kits\\10\\bin\\10.0.20348.0\\x64\\mt.exe"

        project.exec {
            commandLine(mt, "-manifest", manifestFile.absolutePath, "-outputresource:${exeFile.absolutePath};#1" )
        }
    }
}