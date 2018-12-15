plugins {
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    // This dependency is exported to consumers, that is to say found on their compile classpath.
	// Espone interfacce + le librerie specificate nel path
    api("org.apache.commons:commons-math3:3.6.1")

    // This dependency is used internally, and not exposed to consumers on their own compile classpath.
    implementation("com.google.guava:guava:26.0-jre")

    // Use JUnit test framework
    testImplementation("junit:junit:4.12")
}
