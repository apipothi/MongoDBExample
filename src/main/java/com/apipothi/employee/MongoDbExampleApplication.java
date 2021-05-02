package com.apipothi.employee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoDbExampleApplication {

	private final static Logger logger = LoggerFactory.getLogger(MongoDbExampleApplication.class);

	public static void main(String[] args) {
		logger.info("MongoDbExampleApplication - Starting ");

		SpringApplication.run(MongoDbExampleApplication.class, args);

		logger.info("MongoDbExampleApplication - Started ");
	}

}
