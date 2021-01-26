package com.marcuschiu.conditionalonpropertyexample.config.order.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
//@AutoConfigureBefore(CustomAutoConfigureAfter_AutoConfiguration.class)
public class CustomAutoConfigureBefore_AutoConfiguration {

    @Bean
    public String methodCustomAutoConfigureBefore() {
        System.out.println("inside - @AutoConfigureBefore - CustomAutoConfigureBefore.methodCustomAutoConfigureBefore()");
        return "CustomAutoConfigureBefore.methodCustomAutoConfigureBefore";
    }
}
