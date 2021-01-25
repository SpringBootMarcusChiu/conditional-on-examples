package com.marcuschiu.conditionalonpropertyexample.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class ConditionalOnPropertyConfig {

    @Bean
    @ConditionalOnProperty(prefix = "prefix", name = "a", matchIfMissing = true)
    public String a1() {
        System.out.println("inside a1 - @ConditionalOnProperty(prefix = \"prefix\", name = \"a\", matchIfMissing = true)");
        return "a1";
    }

    @Bean
    @ConditionalOnProperty(prefix = "prefix", name = "a", matchIfMissing = false)
    public String a2() {
        System.out.println("inside a2 - @ConditionalOnProperty(prefix = \"prefix\", name = \"a\", matchIfMissing = false)");
        return "a2";
    }
}
