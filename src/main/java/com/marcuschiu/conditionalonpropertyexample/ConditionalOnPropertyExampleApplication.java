package com.marcuschiu.conditionalonpropertyexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class ConditionalOnPropertyExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConditionalOnPropertyExampleApplication.class, args);
	}
}
