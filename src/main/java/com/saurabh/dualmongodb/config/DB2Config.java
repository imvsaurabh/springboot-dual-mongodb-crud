package com.saurabh.dualmongodb.config;

import com.saurabh.dualmongodb.repo.DB2.Test2Repo;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(
        basePackages = "com.saurabh.dualmongodb.repo.DB2",
        mongoTemplateRef = DB2Config.MONGO_TEMPLATE
)
public class DB2Config {
    protected static final String MONGO_TEMPLATE = "secondaryMongoTemplate";
}
