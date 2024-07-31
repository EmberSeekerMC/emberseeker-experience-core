plugins {
    kotlin("jvm") version "1.9.22"
    kotlin("plugin.serialization") version "1.9.22"
    id("io.ktor.plugin") version "2.2.3"
    application
}

group = "com.github.emberseeker"
version = "0.1"

repositories {
    mavenCentral()
    maven("https://mvn.devos.one/releases")
    maven("https://jitpack.io")
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    implementation("cz.lukynka:pretty-log:1.4")
    implementation("cz.lukynka:lkws:1.2")
    implementation("io.ktor:ktor-server-netty:2.3.10")
    implementation("io.ktor:ktor-network:2.3.10")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.0")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:1.3.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2")
    implementation("com.akuleshov7:ktoml-core:0.5.1")
    implementation("com.akuleshov7:ktoml-file:0.5.1")
    implementation("io.github.cdimascio:dotenv-kotlin:6.4.1")
}

kotlin {
    jvmToolchain(21)
}