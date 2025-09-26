package com.awsdynamodb.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {
		"com.awsdynamodb.demo.config",
		"com.awsdynamodb.demo.controller",
		"com.awsdynamodb.demo.repository",
		"com.awsdynamodb.demo.service"})
public class AwsDynamodbDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsDynamodbDemoApplication.class, args);
	}

}
