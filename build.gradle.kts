plugins {
    kotlin("jvm") version "1.6.21"
}

group = "org.dkazantsev"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))

    runtimeOnly("org.jetbrains.kotlin:kotlin-reflect:1.7.0")
    api("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.6.8")
    implementation("org.springframework.boot:spring-boot-starter-webflux:2.6.8")
    implementation("org.postgresql:postgresql:42.3.6")
    implementation("org.liquibase:liquibase-core:4.9.0")
    implementation("com.auth0:java-jwt:3.19.2")

}

tasks.test {
    useJUnitPlatform()
}
