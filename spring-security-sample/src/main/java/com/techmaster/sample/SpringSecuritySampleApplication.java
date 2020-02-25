package com.techmaster.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringSecuritySampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecuritySampleApplication.class, args);
	}
}
