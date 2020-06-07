plugins {
	id("org.springframework.boot")

	kotlin("jvm")
	kotlin("plugin.spring")
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-mongodb")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

	implementation(project(":domain"))
	implementation(project(":driving"))
	implementation(project(":driven"))

	implementation("org.testcontainers:testcontainers:${property("testcontainersVersion")}")
	implementation("org.testcontainers:mongodb:${property("testcontainersVersion")}")
	testImplementation("org.testcontainers:junit-jupiter:${property("testcontainersVersion")}")

	testImplementation("org.springframework.boot:spring-boot-starter-test") {
		exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
	}
}
