package com.marcuschiu.conditionalonpropertyexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

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
			if (beanName.contains("method")) {
				System.out.println(beanName);
			}
		}
	}
}
