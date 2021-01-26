### @AutoConfigureAfter & @AutoConfigureBefore
- only controls the ordering of auto-configuration classes and has no effect on dependency injection
- There is a difference between parsing the configuration and its structure and effectively creating beans at runtime
- AutoConfigureAfter controls the order in which the configuration files are processed and their bean definitions are created. The order in which beans are created from those definitions is a separate concern and depends on, among other things, the dependencies that exist between your beans