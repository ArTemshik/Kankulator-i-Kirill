// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.8.0" apply false // Версия AGP
    id("org.jetbrains.kotlin.android") version "1.8.0" apply false // Версия Kotlin
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}