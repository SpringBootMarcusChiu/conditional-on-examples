package com.marcuschiu.conditionalonpropertyexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class ConditionalOnPropertyExampleApplication {

	private static ApplicationContext applicationContext;

	public static void main(String[] args) {
		applicationContext = SpringApplication.run(ConditionalOnPropertyExampleApplication.class, args);
		displayAllBeans();
	}

	public static void displayAllBeans() {
		String[] allBeanNames = applicationContext.getBeanDefinitionNames();
		System.out.println("\nList of Method Beans");
		for(String beanName : allBeanNames) {
			if (beanName.contains("methodConditionalOn")) {
				System.out.println(beanName);
			}
		}
	}
}
