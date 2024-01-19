package com.example.SpringTestProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@AutoConfiguration
public class SpringTestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTestProjectApplication.class, args);
	}

}
