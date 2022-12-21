package com.saurabh.dualmongodb.repo.DB1;

import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "test1")
@ToString
public class Test1 {
    @Id
    private String id;
    private String name;
    private String email;
}
