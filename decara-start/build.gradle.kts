import java.net.URI

plugins {
    java
    alias(libs.plugins.spring.boot)
    alias(libs.plugins.dependency.management)
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

repositories {
    mavenLocal()
    maven { url = URI("https://maven.aliyun.com/repository/public/") }
    mavenCentral()
}

dependencies {
    implementation(project(":decara-adapter"))
    implementation(libs.spring.boot.starter.web)
    implementation(libs.mybatis.flex.boot.starter)
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.bootJar {
    enabled = true
    archiveBaseName.set("decara-start")
    archiveVersion.set("0.0.1-SNAPSHOT")
}





