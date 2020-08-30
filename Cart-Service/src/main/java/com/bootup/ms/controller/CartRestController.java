package com.bootup.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bootup.ms.entity.Cart;
import com.bootup.ms.service.CartService;

@Controller
@RequestMapping("/api")
public class CartRestController {
	
	@Autowired
	CartService cs;

	
	@PostMapping("/cart/{custName}")
	public Cart addItemToCart(@PathVariable String custName, @RequestBody Cart insertCart) {
		
		return insertCart;
		
	}
	
}
