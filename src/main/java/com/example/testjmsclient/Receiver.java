package com.example.testjmsclient;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

	@JmsListener(destination = "myQueue")
	public void readMessage(String message) {
		System.out.println("Received message: " + message);
	}

}
