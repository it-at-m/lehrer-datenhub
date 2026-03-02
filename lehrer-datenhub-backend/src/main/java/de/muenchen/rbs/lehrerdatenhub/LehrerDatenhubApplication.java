package de.muenchen.rbs.lehrerdatenhub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

/**
 * Application class for starting the microservice.
 */
@SpringBootApplication
@ConfigurationPropertiesScan
@SuppressWarnings("PMD.UseUtilityClass")
public class LehrerDatenhubApplication {
    public static void main(final String[] args) {
        SpringApplication.run(LehrerDatenhubApplication.class, args);
    }
}
