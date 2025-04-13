plugins {
    java
    id("java-library")
    alias(libs.plugins.spring.boot)
    alias(libs.plugins.dependency.management)
}

dependencies {
    api(project(":decara-infrastructure"))
    api(project(":decara-client"))
    api(libs.cola.component.catchlog.starter)
}

tasks.bootJar {
    enabled = false
}

tasks.jar {
    enabled = true
}