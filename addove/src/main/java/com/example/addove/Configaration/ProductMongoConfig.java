package com.example.addove.Configaration;

import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.client.MongoClients;

@Configuration
@EnableMongoRepositories(
    basePackages = "com.example.addove.product.repository",
    mongoTemplateRef = "productMongoTemplate"
)
public class ProductMongoConfig {

    @Bean
    public MongoTemplate productMongoTemplate() {
        return new MongoTemplate(
            MongoClients.create(productUri()),
            "productProductionDetails"
        );
    }

    @Bean
    @ConfigurationProperties(prefix = "mongodb.product")
    public MongoProperties productProperties() {
        return new MongoProperties();
    }

    private String productUri() {
        return productProperties().getUri();
    }
}
