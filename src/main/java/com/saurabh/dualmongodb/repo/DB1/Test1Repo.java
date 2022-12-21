package com.saurabh.dualmongodb.repo.DB1;

import com.saurabh.dualmongodb.repo.DB1.Test1;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Test1Repo extends MongoRepository<Test1, String> {
}
