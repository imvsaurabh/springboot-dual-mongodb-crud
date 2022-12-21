package com.saurabh.dualmongodb.repo.DB2;

import com.saurabh.dualmongodb.repo.DB2.Test2;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Test2Repo extends MongoRepository<Test2, String> {
}
