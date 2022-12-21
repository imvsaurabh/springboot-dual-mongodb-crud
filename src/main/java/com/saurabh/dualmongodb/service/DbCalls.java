package com.saurabh.dualmongodb.service;

import com.saurabh.dualmongodb.repo.DB1.Test1Repo;
import com.saurabh.dualmongodb.repo.DB2.Test2Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class DbCalls {

    @Autowired
    private Test1Repo test1Repo;

    @Autowired
    private Test2Repo test2Repo;

    @Bean
    public void test() {
        System.out.println(test1Repo.findAll());
        System.out.println(test2Repo.findAll());
    }
}
