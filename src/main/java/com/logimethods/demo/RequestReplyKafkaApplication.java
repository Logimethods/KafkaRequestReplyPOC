package com.logimethods.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {
        "com.logimethods.config",
        "com.logimethods.consumer",
        "com.logimethods.controller",
        "com.logimethods.model"
    })
@SpringBootApplication
public class RequestReplyKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RequestReplyKafkaApplication.class, args);
	}
}
