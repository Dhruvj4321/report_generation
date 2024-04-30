package com.report.generation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class GenerationApplication {

	public static void main(String[] args) {
		SpringApplication.run(GenerationApplication.class, args);
	}
 
}
