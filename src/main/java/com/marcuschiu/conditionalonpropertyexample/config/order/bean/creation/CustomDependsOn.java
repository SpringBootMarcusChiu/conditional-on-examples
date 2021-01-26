package com.marcuschiu.conditionalonpropertyexample.config.order.bean.creation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class CustomDependsOn {

    @Bean
    public String methodA(){
        System.out.println("inside - A");
        return "A";
    }

    @Bean
    @DependsOn({"C","D"})
    public String methodB(){
        System.out.println("inside - B");
        return "B";
    }

    @Bean("C")
    public String methodC() {
        System.out.println("inside - C");
        return "C";
    }

    @Bean("D")
    public String methodD() {
        System.out.println("inside - D");
        return "D";
    }
}
