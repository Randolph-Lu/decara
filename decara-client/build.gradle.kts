plugins {
    java
    id("java-library")
    alias(libs.plugins.spring.boot)
    alias(libs.plugins.dependency.management)
}

dependencies {
    api(libs.cola.component.dto)
    compileOnly(libs.lombok)
    annotationProcessor(libs.lombok)
}

tasks.bootJar {
    enabled = false
}

tasks.jar {
    enabled = true
}
