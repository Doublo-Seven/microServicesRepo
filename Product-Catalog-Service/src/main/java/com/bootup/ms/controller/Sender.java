package com.bootup.ms.controller;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller
public class Sender {
	
	@Autowired
	RabbitMessagingTemplate rabbitMsgTemplate;
	
	@Bean
	Queue queue() {
		return new Queue("PriceQ",false);
	}
	
	public void send(Object price) {
		rabbitMsgTemplate.convertAndSend(price);
	}

}
