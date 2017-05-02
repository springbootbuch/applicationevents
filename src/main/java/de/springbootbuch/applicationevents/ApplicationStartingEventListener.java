/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.springbootbuch.applicationevents;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

/**
 *
 * @author Michael J. Simons, 2017-05-02
 */
public class ApplicationStartingEventListener 
	implements ApplicationListener<ApplicationStartingEvent> {

	@Override
	public void onApplicationEvent(ApplicationStartingEvent event) {
		System.out.println("wahaaaaaa");
	}

}
