val requery_version: String by project

plugins {
    application
}

dependencies {
    implementation("io.requery:requery:$requery_version")
    implementation("io.requery:requery-kotlin:$requery_version")
    annotationProcessor("io.requery:requery-processor:$requery_version")

    implementation(project(":common:database"))
}

kotlin.sourceSets["main"].kotlin.srcDirs("src/main")
kotlin.sourceSets["test"].kotlin.srcDirs("src/test")

sourceSets["main"].resources.srcDirs("src/main/resources")
sourceSets["test"].resources.srcDirs("src/test/resources")
