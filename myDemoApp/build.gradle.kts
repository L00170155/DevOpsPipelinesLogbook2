/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn more about Gradle by exploring our samples at https://docs.gradle.org/7.4.2/samples
 */

plugins {
    application
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

dependencies {
    implementation("com.google.guava:guava:30.1.1-jre")
    implementation("joda-time:joda-time:2.10.14")
    testImplementation("org.testng:testng:7.4.0")
}

repositories {
    mavenCentral()
}

application {
    mainClass.set("hello.HelloWorld")
}

defaultTasks("test")

tasks.getByName<Test>("test") {
    useTestNG()
}