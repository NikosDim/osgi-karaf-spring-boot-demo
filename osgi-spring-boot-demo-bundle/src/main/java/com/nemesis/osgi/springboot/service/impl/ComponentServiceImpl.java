package com.nemesis.osgi.springboot.service.impl;

import com.nemesis.osgi.springboot.service.ComponentService;
import org.osgi.service.component.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

import static com.nemesis.osgi.springboot.service.impl.ComponentServiceImpl.COMPONENT_NAME;

@Component(name = COMPONENT_NAME, configurationPolicy = ConfigurationPolicy.REQUIRE)
public class ComponentServiceImpl implements ComponentService {
    private final static Logger LOGGER = LoggerFactory.getLogger(ComponentServiceImpl.class);

    public static final String COMPONENT_NAME = "CommandServiceImpl";


    @Activate
    public void activate(final Map<String, ?> properties) {
        LOGGER.info("Activating the {}", COMPONENT_NAME);

        LOGGER.info("{}", properties.get("myProp"));
    }

    @Deactivate
    public void deactivate() {
        LOGGER.info("Deactivating the {}", COMPONENT_NAME);
    }

    @Modified
    public void modified(final Map<String, ?> properties) {
        LOGGER.info("Something was modified");
        LOGGER.info("{}", properties.get("myProp"));
    }
}
