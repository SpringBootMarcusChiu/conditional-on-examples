package com.marcuschiu.conditionalonpropertyexample.config.property;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionalOnPropertyConfig {

    /**
     * bean created when `prefix.a` (not equals false) or (doesn't exist)
     */
    @Bean
    @ConditionalOnProperty(prefix = "prefix", name = "a", matchIfMissing = true)
    public String methodConditionalOnPropertyConfig1() {
        System.out.println("inside - @ConditionalOnProperty(prefix = \"prefix\", name = \"a\", matchIfMissing = true)");
        return "methodConditionalOnPropertyConfig1";
    }

    /**
     * bean created when `prefix.a` (not equals false)
     */
    @Bean
    @ConditionalOnProperty(prefix = "prefix", name = "a", matchIfMissing = false)
    public String conditionalOnPropertyConfig2() {
        System.out.println("inside - @ConditionalOnProperty(prefix = \"prefix\", name = \"a\", matchIfMissing = false)");
        return "methodConditionalOnPropertyConfig2";
    }
}
