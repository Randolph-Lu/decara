plugins {
    java
    id("java-library")
    alias(libs.plugins.spring.boot)
    alias(libs.plugins.dependency.management)
}

dependencies {
    api(libs.cola.component.exception)
    api(libs.cola.component.domain.starter)
    implementation(libs.hutool.all)
    implementation(libs.slf4j.api)
    compileOnlyApi(libs.lombok)
    annotationProcessor(libs.lombok)
    annotationProcessor(libs.mybatis.flex.processor)
}

tasks.bootJar {
    enabled = false
}

tasks.jar {
    enabled = true
}