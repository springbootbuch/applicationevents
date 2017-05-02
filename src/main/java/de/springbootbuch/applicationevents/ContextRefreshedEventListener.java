package de.springbootbuch.applicationevents;

import static de.springbootbuch.applicationevents.Application.LOG;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Part of springbootbuch.de.
 *
 * @author Michael J. Simons
 * @author @rotnroll666
 */
@Component
public class ContextRefreshedEventListener
	implements ApplicationListener<ContextRefreshedEvent> {

	@Override
	public void onApplicationEvent(
		ContextRefreshedEvent event
	) {
		LOG.debug(
			"ContextRefreshedEvent at {}", 
			event.getTimestamp());
	}
}
