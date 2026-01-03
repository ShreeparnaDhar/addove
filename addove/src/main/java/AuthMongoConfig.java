import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.client.MongoClients;

@Configuration
@EnableMongoRepositories(
    basePackages = "com.example.addove.auth.repository",
    mongoTemplateRef = "authMongoTemplate"
)
public class AuthMongoConfig {

    @Bean
    @Primary
    public MongoTemplate authMongoTemplate() {
        return new MongoTemplate(
            MongoClients.create(authUri()),
            "authdb"
        );
    }

    @Bean
    @ConfigurationProperties(prefix = "mongodb.auth")
    public MongoProperties authProperties() {
        return new MongoProperties();
    }

    private String authUri() {
        return authProperties().getUri();
    }
}
