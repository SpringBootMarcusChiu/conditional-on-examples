package com.marcuschiu.conditionalonpropertyexample.config.bean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class ConditionalOnBeanConfigB {

    /**
     * bean created if another bean with name `methodConditionalOnBeanConfig1` exists
     * TODO for some reason this gets created even though in ConditionalOnBeanConfigB doesn't
     */
    @Bean
    @ConditionalOnBean
    public String methodConditionalOnBeanConfig1() {
        System.out.println("inside - @ConditionalOnBean - ConditionalOnBeanConfigB.methodConditionalOnBeanConfig1()");
        return "ConditionalOnBeanConfigB.methodConditionalOnBeanConfig1";
    }

    /**
     * bean created if another bean of name `methodConditionalOnBeanConfig1` exists
     */
    @Bean
    @ConditionalOnBean(name = "methodConditionalOnBeanConfig1")
    public String methodConditionalOnBeanConfig2b() {
        System.out.println("inside - @ConditionalOnBean - ConditionalOnBeanConfigA.methodConditionalOnBeanConfig2()");
        return "ConditionalOnBeanConfigA.methodConditionalOnBeanConfig2";
    }

    /**
     * bean created if no other bean with name `conditionalOnBeanConfig2` exists
     */
    @Bean
    @ConditionalOnMissingBean
    public String methodConditionalOnMissingBeanConfig1() {
        System.out.println("inside - @ConditionalOnMissingBean - ConditionalOnBeanConfigB.methodConditionalOnMissingBeanConfig1()");
        return "ConditionalOnBeanConfigB.methodConditionalOnMissingBeanConfig1";
    }

    /**
     * bean created if no other bean of type `DataSource.class` exists
     */
    @Bean
    @ConditionalOnMissingBean(DataSource.class)
    public String methodConditionalOnMissingBeanConfig2b() {
        System.out.println("inside - @ConditionalOnMissingBean(DataSource.class) - ConditionalOnBeanConfigB.methodConditionalOnMissingBeanConfig2b()");
        return "ConditionalOnBeanConfigB.methodConditionalOnMissingBeanConfig2b";
    }
}
