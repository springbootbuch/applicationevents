package de.springbootbuch.applicationevents;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;

/**
 * Part of springbootbuch.de.
 *
 * @author Michael J. Simons
 * @author @rotnroll666
 */
@SpringBootApplication
public class Application {

	static final Logger LOG = LoggerFactory
		.getLogger(Application.class);
	
	public static void main(String[] args) {
		final SpringApplicationBuilder builder
			= new SpringApplicationBuilder(
				Application.class);
		builder.listeners(
			(ApplicationStartingEvent event) -> {
				System.out.println("Starting...");
			},
			(ApplicationEnvironmentPreparedEvent event) -> {
				LOG.debug(
					"Environment prepared: {}",
					event.getEnvironment());
			},
			(ApplicationPreparedEvent event) -> {
				LOG.debug(
					"ApplicationPreparedEvent at {} ",
					event.getTimestamp());
			})
			.run(args);
	}
}