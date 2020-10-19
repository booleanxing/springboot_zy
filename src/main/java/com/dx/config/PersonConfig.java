package com.dx.config;


import com.dx.service.serviceImpl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration指明当前类是一个配置类
 */
@Configuration
public class PersonConfig {
    @Bean
    public UserServiceImpl userService() {
        return new UserServiceImpl();
    }
}
