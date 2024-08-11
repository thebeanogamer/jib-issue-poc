plugins {
    id("java")
    application
    id("com.google.cloud.tools.jib") version "3.4.3"
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val launcherClassName = "com.example.Main"


application {
    mainClass.set(launcherClassName)
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

jib {
    container {
        mainClass = launcherClassName
    }
    setAllowInsecureRegistries(true)
    to {
        image = "localhost:5000/example:latest"
    }
}