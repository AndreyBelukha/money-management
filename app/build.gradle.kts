
plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
}

repositories {
    // Use JCenter for resolving dependencies.
    jcenter()
}

dependencies {


    // Use JUnit Jupiter API for testing.
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.2")

    // Use JUnit Jupiter Engine for testing.
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

application {
    // Define the main class for the application.
    mainClass.set("money.management.App")
}

tasks.test {
    // Use junit platform for unit tests.
    useJUnitPlatform()
}
