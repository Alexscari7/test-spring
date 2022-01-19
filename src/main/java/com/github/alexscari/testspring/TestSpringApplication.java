package com.github.alexscari.testspring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestSpringApplication {

	private static Logger logger = LoggerFactory.getLogger(TestSpringApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TestSpringApplication.class, args);
		logger.info("启动成功");
	}

}
