package com.saurabh.dualmongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude = {
		MongoAutoConfiguration.class,
		MongoDataAutoConfiguration.class
})
public class DualMongodbCrudApplication {
//	@Autowired
//	private Test1Repo test1Repo;
//
//	@Autowired
//	private  Test2Repo test2Repo;

	public static void main(String[] args) {
		SpringApplication.run(DualMongodbCrudApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner runner() {
//		return args -> {
//			System.out.println("Test1: " + test1Repo.findAll());
//			System.out.println("Test2: " + test2Repo.findAll());
//		};
//	}

}
