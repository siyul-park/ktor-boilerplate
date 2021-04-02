val kotlin_version: String by project

buildscript {
    val klint_version: String by project

    repositories {
        maven { url = uri("https://plugins.gradle.org/m2/") }
        jcenter()
    }
    dependencies {
        classpath("org.jlleitschuh.gradle:ktlint-gradle:$klint_version")
    }
}

plugins {
    application
    kotlin("jvm") version "1.4.21"
    id("org.jlleitschuh.gradle.ktlint")
}

group = "io.github.siyual_park"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenLocal()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib"))
}
