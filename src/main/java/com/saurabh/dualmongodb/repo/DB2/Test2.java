package com.saurabh.dualmongodb.repo.DB2;

import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "test2")
@ToString
public class Test2 {
    @Id
    private String id;
    private String mobile;
}
