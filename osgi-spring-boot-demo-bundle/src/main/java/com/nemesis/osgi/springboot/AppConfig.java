package com.nemesis.osgi.springboot;

import com.nemesis.osgi.springboot.controller.ControllerConfig;
import com.nemesis.osgi.springboot.service.ComponentService;
import com.nemesis.osgi.springboot.service.impl.ComponentServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ControllerConfig.class)
public class AppConfig {

    @Bean
    public AppProperties appProperties() {
        return new AppProperties();
    }

    @Bean
    public ComponentService componentService() {
        return new ComponentServiceImpl();
    }
}
