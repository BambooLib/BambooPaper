plugins {
    id("bamboo.kotlin-library")
    alias(libs.plugins.paperweight.userdev)
}

group = rootProject.group
version = rootProject.version

dependencies {
    paperweight.paperDevBundle(libs.versions.paper.get())
    testImplementation(libs.junit.jupiter)
    testRuntimeOnly(libs.junit.platform.launcher)
}
