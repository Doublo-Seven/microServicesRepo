package com.bootup.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootup.ms.service.PriceService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class PriceRestController {

	@Autowired
	PriceService ps;
	
	@GetMapping("/price/{prodId}")
	public double getPriceOfProduct(@PathVariable("prodId") int prodId) {
		
		return ps.findByProdId(prodId).getPrice();
	}
	

}
