package com.nemesis.osgi.springboot.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ControllerConfig {

    @Bean
    HelloController helloController() {
        return new HelloController();
    }
}
