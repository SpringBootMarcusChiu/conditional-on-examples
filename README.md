http://confluence.marcuschiu.com/x/HQBpAQ

## ConditionalOn* are Evaulated in Order of Scanning @Configuration Classes
- thus, if a bean is created in a later Configuration class, then the prior Configuration class with @ConditionalOnBean(that-bean-in-later-configuration) will not be activated :(