package com.abhi.micro.activemqmessaging.messages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;

public class SendMessageToQueue {
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	public void send(String message) {
		jmsTemplate.convertAndSend("Q1","Hello Message from JMS MQ");
	}

}
