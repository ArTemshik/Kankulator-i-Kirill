plugins {
    id("com.android.application") // Плагин для Android-приложений
    id("org.jetbrains.kotlin.android") // Плагин для Kotlin
}

android {
    namespace = "com.example.calculator" // Замените на ваш namespace
    compileSdk = 33 // Версия SDK для компиляции

    defaultConfig {
        applicationId = "com.example.calculator" // Замените на ваш applicationId
        minSdk = 21 // Минимальная версия SDK
        targetSdk = 33 // Целевая версия SDK
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.toVersion(8)
        targetCompatibility = JavaVersion.toVersion(8)
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.9.0") // Базовая библиотека Kotlin для Android
    implementation("androidx.appcompat:appcompat:1.6.1") // Поддержка AppCompat
    implementation("com.google.android.material:material:1.8.0") // Material Design
    implementation("androidx.constraintlayout:constraintlayout:2.1.4") // ConstraintLayout
}