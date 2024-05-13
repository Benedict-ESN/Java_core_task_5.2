plugins {
    id("java")
    id ("application")
}
tasks.jar {
    manifest {
        attributes["Main-Class"] = "ru.netology.Main"
    }
}

group = "ru.netology"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.opencsv:opencsv:5.5")
    implementation("com.googlecode.json-simple:json-simple:1.1.1")
    implementation("com.google.code.gson:gson:2.8.9")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}