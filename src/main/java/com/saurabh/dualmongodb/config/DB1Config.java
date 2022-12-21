package com.saurabh.dualmongodb.config;

import com.saurabh.dualmongodb.repo.DB1.Test1Repo;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(
        basePackages = "com.saurabh.dualmongodb.repo.DB1",
        mongoTemplateRef = DB1Config.MONGO_TEMPLATE
)
public class DB1Config {
    protected static final String MONGO_TEMPLATE = "primaryMongoTemplate";
}
