package com.test.iottelemetry.Config;


import com.microsoft.azure.spring.autoconfigure.cosmosdb.DocumentDBProperties;
import com.microsoft.azure.spring.data.cosmosdb.config.AbstractDocumentDbConfiguration;
import com.microsoft.azure.spring.data.cosmosdb.config.DocumentDBConfig;
import com.microsoft.azure.spring.data.cosmosdb.repository.config.EnableDocumentDbRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDocumentDbRepositories(basePackages = "com.test.iottelemetry.devicetelemetry")
@EnableConfigurationProperties(DocumentDBProperties.class)
public class CosmosConfig extends AbstractDocumentDbConfiguration {
    @Autowired
    private DocumentDBProperties properties;

    @Override
    public DocumentDBConfig getConfig() {
        return DocumentDBConfig.builder(properties.getUri(),
                properties.getKey(),
                properties.getDatabase()).build();
    }
}
