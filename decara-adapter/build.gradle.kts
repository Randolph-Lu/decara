plugins {
    java
    id("java-library")
    alias(libs.plugins.spring.boot)
    alias(libs.plugins.dependency.management)
}

dependencies {
    api(project(":decara-app"))
    implementation(libs.spring.boot.starter.web)
    testImplementation(libs.spring.boot.starter.test)
}

tasks.bootJar {
    enabled = false
}

tasks.jar {
    enabled = true
}
