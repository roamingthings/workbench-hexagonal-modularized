plugins {
    `java-library`
    kotlin("jvm")
    kotlin("plugin.spring")
}

dependencies {
    implementation(platform("org.springframework.boot:spring-boot-dependencies:${property("springBootVersion")}"))
    annotationProcessor(platform("org.springframework.boot:spring-boot-dependencies:${property("springBootVersion")}"))

//    implementation(project(":domain"))

    implementation(kotlin("stdlib-jdk8"))
}
