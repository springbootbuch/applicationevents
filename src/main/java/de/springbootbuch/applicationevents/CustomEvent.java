/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.springbootbuch.applicationevents;

import static de.springbootbuch.applicationevents.Application.LOG;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


public class CustomEvent {	
	
	final String msg;

	public CustomEvent(String msg) {
		this.msg = msg;
	}	
}
@Component
class CustomEventListener {
	@EventListener
	public void handleEvent(CustomEvent event) {
		LOG.debug(event.msg);
	}
}
@Component
class DemoComponent {	
	public DemoComponent(ApplicationEventPublisher applicationEventPublisher) {
		applicationEventPublisher
			.publishEvent(new CustomEvent("DemoComponent initialized"));
		System.out.println("what??!");
	}
}


