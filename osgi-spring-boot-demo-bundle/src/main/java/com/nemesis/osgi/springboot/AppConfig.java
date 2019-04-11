package com.nemesis.osgi.springboot;

import com.nemesis.osgi.springboot.controller.ControllerConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ControllerConfig.class)
public class AppConfig {

}
