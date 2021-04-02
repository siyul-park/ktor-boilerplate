rootProject.name = "ktor-boilerplate"

pluginManagement {
    val klint_version: String by settings
    val kotlin_version: String by settings

    plugins {
        kotlin("jvm") version kotlin_version
        id("org.jlleitschuh.gradle.ktlint") version klint_version
    }
}

include("application:network")
