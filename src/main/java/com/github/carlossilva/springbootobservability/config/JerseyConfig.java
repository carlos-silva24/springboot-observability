package com.github.carlossilva.springbootobservability.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.context.annotation.Configuration;

import jakarta.ws.rs.ApplicationPath;

/**
 * {@link Configuration} for REST (JAX-RS) services.
 */
@Configuration
@ApplicationPath("/")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        packages("com.github.carlossilva.springbootobservability.rest");
        property(ServletProperties.FILTER_FORWARD_ON_404, true);
    }

}
