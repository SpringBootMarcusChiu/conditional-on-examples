package com.marcuschiu.conditionalonpropertyexample.config.clazz;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class ConditionalOnClassConfig {

    @Bean
    @ConditionalOnClass(DataSource.class)
    public String methodConditionalOnClassConfig1() {
        System.out.println("inside - @ConditionalOnClass(DataSource.class)");
        return "methodConditionalOnClassConfig1";
    }

    @Bean
    @ConditionalOnMissingClass("org.springframework.data.redis.core.RedisTemplate")
    public String conditionalOnClassConfig2() {
        System.out.println("inside - @ConditionalOnMissingClass(\"org.springframework.data.redis.core.RedisTemplate\")");
        return "methodConditionalOnClassConfig2";
    }
}
