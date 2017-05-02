package de.springbootbuch.applicationevents;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Part of springbootbuch.de.
 *
 * @author Michael J. Simons
 * @author @rotnroll666
 */
@Component
public class ContextClosedEventListener {
	
	@EventListener
	public void contextClosed(
		final ContextClosedEvent event
	) {
		Application.LOG.debug(
			"ContextClosedEvent at {}", 
			event.getTimestamp());
	}
}