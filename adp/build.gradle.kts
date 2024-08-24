plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.jetbrainsCompose)
    alias(libs.plugins.compose.compiler)
    id("maven-publish")
}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }
    
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "adp"
            isStatic = true
        }
    }

    sourceSets {
        commonMain.dependencies {
            compileOnly(compose.ui)
            compileOnly(compose.runtime)
            compileOnly(compose.foundation)
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}

android {
    namespace = "com.mohitsoni.adp"
    compileSdk = 34
    defaultConfig {
        minSdk = 28
    }
}

afterEvaluate {
    publishing{
        publications {
            repositories {
                maven {
                    group = "com.github.mohitsoni48"
                    name = "aDp"
                    version = "1.0.0.alpha4"
                }
            }
        }
    }
}