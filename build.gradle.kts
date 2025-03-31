plugins {
    java
    application
    kotlin("jvm") version "1.8.0"
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
    implementation(kotlin("stdlib-jdk8"))
}

application {
    mainClass.set("com.example.Main")
}

tasks.test {
    useJUnitPlatform()
}