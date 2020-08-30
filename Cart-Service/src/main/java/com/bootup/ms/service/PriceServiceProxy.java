package com.bootup.ms.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="price-service", url="http://localhost:8082/api/")
public interface PriceServiceProxy {

	@GetMapping("/price/{prodId}")
	double getPriceOfProduct(@PathVariable("prodId") int prodId);//access specifier is public by default for interface methods
}
