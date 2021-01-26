package com.marcuschiu.conditionalonpropertyexample.config.conditional.on.bean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
//@ConditionalOnBean(name = "methodConditionalOnClassConfig1")
public class ConditionalOnBean_A_AutoConfiguration {

    /**
     * bean created if another bean with name `methodConditionalOnBeanConfig1` exists
     * TODO this is not created but in ConditionalOnBeanConfigA does...
     */
    @Bean
    @ConditionalOnBean
    public String methodConditionalOnBeanConfig1() {
        System.out.println("inside - @ConditionalOnBean - ConditionalOnBeanConfigA.methodConditionalOnBeanConfig1()");
        return "ConditionalOnBeanConfigA.methodConditionalOnBeanConfig1";
    }

    /**
     * bean created if another bean of name `methodConditionalOnBeanConfig1` exists
     */
    @Bean
    @ConditionalOnBean(name = "methodConditionalOnBeanConfig1")
    public String methodConditionalOnBeanConfig2() {
        System.out.println("inside - @ConditionalOnBean - ConditionalOnBeanConfigA.methodConditionalOnBeanConfig2()");
        return "ConditionalOnBeanConfigA.methodConditionalOnBeanConfig2";
    }

    /**
     * bean created if no other bean with name `conditionalOnBeanConfig2` exists
     */
    @Bean
    @ConditionalOnMissingBean
    public String methodConditionalOnMissingBeanConfig1() {
        System.out.println("inside - @ConditionalOnMissingBean - ConditionalOnBeanConfigA.methodConditionalOnMissingBeanConfig1()");
        return "ConditionalOnBeanConfigA.methodConditionalOnMissingBeanConfig1";
    }

    /**
     * bean created if no other bean of type `DataSource.class` exists
     */
    @Bean
    @ConditionalOnMissingBean(DataSource.class)
    public String methodConditionalOnMissingBeanConfig2() {
        System.out.println("inside - @ConditionalOnMissingBean(DataSource.class) - ConditionalOnBeanConfigA.methodConditionalOnMissingBeanConfig2()");
        return "ConditionalOnBeanConfigA.methodConditionalOnMissingBeanConfig2";
    }
}
