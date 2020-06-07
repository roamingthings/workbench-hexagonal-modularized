package de.roamingthings.hexagonal.configuration

import org.springframework.boot.autoconfigure.mongo.MongoProperties
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile
import org.testcontainers.containers.MongoDBContainer
import javax.annotation.PostConstruct

@Configuration
@Profile("localdb")
class LocalMongoDbConfiguration(val mongoProperties: MongoProperties) {

    private val mongoDbContainer = MongoDBContainer()

    @PostConstruct
    fun startContainer() {
        mongoDbContainer.start();
        mongoProperties.port = mongoDbContainer.firstMappedPort
    }
}
