package com.marcuschiu.conditionalonpropertyexample.config.order.configuration;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
//@AutoConfigureAfter(CustomAutoConfigureBefore_AutoConfiguration.class)
public class CustomAutoConfigureAfter_AutoConfiguration {

    @Bean
    public String methodCustomAutoConfigureAfter() {
        System.out.println("inside - @AutoConfigureAfter - CustomAutoConfigureAfter.methodCustomAutoConfigureAfter()");
        return "CustomAutoConfigureAfter.methodCustomAutoConfigureAfter";
    }
}
