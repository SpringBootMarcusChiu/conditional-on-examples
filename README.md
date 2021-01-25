http://confluence.marcuschiu.com/x/HQBpAQ

## ConditionalOn* are Evaulated in Order of Scanning @Configuration Classes
- thus, if a bean is created in a later Configuration class, then the prior Configuration class with @ConditionalOnBean(that-bean-in-later-configuration) will not be activated :(

## Autoconfiguration Resources
- https://docs.spring.io/spring-boot/docs/current/reference/html/spring-boot-features.html#boot-features-developing-auto-configuration