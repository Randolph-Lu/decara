plugins {
    java
    id("java-library")
    alias(libs.plugins.spring.boot)
    alias(libs.plugins.dependency.management)
}

dependencies {
    api(project(":decara-domain"))
    implementation(project(":decara-client"))
    implementation(libs.alibaba.dysmsapi.async)
    implementation(libs.mybatis.flex.boot.starter)
    implementation(libs.mysql.connector)
    implementation(libs.hikari.cp)
    api(libs.hutool.all)
    api(libs.guava)
    api(libs.commons.lang3)
    annotationProcessor(libs.mybatis.flex.processor)
    annotationProcessor(libs.lombok)
}

tasks.bootJar {
    enabled = false
}

tasks.jar {
    enabled = true
}
