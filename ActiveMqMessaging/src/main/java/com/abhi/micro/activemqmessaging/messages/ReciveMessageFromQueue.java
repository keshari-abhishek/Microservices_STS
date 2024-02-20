package com.abhi.micro.activemqmessaging.messages;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;

public class ReciveMessageFromQueue {
	
	static String queue= "Q";
	
	@JmsListener(destination="Q")
	public void reciveMessage(@Payload String message,@Headers MessageHeaders headers) {
		//Activate task
		System.out.println("My Message"+message);
		System.out.println(headers.getTimestamp());
		
	}

}
