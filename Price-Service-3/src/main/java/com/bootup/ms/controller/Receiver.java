package com.bootup.ms.controller;

import java.util.Map;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bootup.ms.service.PriceService;

@Controller
public class Receiver {
	
	@Autowired
	PriceService ps;
	
	@RabbitListener(queues = "PriceQ")
	public void processMessage(Map<String,Object> idAndPrice)
	{
		ps.save((int) idAndPrice.get("PRODUCT_ID"),(double) idAndPrice.get("PRICE"));
	}

}
