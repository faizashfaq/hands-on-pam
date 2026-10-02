import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension

plugins {
    kotlin("jvm") version "1.9.24" apply false
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")

    repositories {
        mavenCentral()
    }

    configure<KotlinJvmProjectExtension> {
        jvmToolchain(17)
    }

    dependencies {
        "implementation"("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.0")
    }
}

