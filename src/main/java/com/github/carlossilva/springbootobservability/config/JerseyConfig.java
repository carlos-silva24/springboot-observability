package com.github.carlossilva.springbootobservability.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import io.micrometer.observation.ObservationRegistry;
import jakarta.ws.rs.ApplicationPath;

/**
 * {@link Configuration} for REST (JAX-RS) services.
 */
@Component
@ApplicationPath("/")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        packages("com.github.carlossilva.springbootobservability.rest");
        property(ServletProperties.FILTER_FORWARD_ON_404, true);
    }

    @Bean
    ObservationRegistry observationRegistry() {
        return ObservationRegistry.create();
    }

}
