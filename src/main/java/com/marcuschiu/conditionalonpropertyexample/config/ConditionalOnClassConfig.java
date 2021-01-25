package com.marcuschiu.conditionalonpropertyexample.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class ConditionalOnClassConfig {

    @Bean
    @ConditionalOnClass(DataSource.class)
    public String conditionalOnClassConfigA1() {
        System.out.println("inside - @ConditionalOnClass(DataSource.class)");
        return "conditionalOnClassConfigA1";
    }

    @Bean
    @ConditionalOnMissingClass("org.springframework.data.redis.core.RedisTemplate")
    public String conditionalOnClassConfigA2() {
        System.out.println("inside - @ConditionalOnMissingClass(\"org.springframework.data.redis.core.RedisTemplate\")");
        return "conditionalOnClassConfigA2";
    }
}
