package com.EComm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories(basePackages="com.EComm")
//@SpringBootApplication(scanBasePackages = "com.EComm")
@SpringBootApplication
public class ECommApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommApplication.class, args);
	}

}
