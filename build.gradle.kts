import org.gradle.internal.impldep.org.apache.sshd.sftp.common.extensions.VersionsParser
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id("org.springframework.boot") version "3.3.0"
    id("io.spring.dependency-management") version "1.1.5"
    kotlin("jvm") version "1.9.24"
    kotlin("plugin.spring") version "1.9.24"
}

group = "ip.ac.it_college.std.s23022"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

repositories {
    mavenCentral()
}
val exposedVersion: String by project
dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.bouncycastle:bcprov-jdk18on:1.78.1")
    implementation("org.springframework.session:spring-session-data-redis")
    runtimeOnly("redis.clients:jedis")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json")
    implementation("org.springframework.boot:spring-boot-starter-data-jdbc")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.exposed:exposed-spring-boot-starter:$exposedVersion")
    implementation("org.jetbrains.exposed:exposed-kotlin-datetime:$exposedVersion")
    implementation("org.jetbrains.exposed:exposed-kotlin-datetime")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json")
    runtimeOnly("org.mariadb.jdbc:mariadb-java-client")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
        jvmTarget = JvmTarget.JVM_21
    }
}


tasks.withType<Test> {
    useJUnitPlatform()
}
