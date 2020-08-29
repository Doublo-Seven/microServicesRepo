package com.bootup.ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootup.ms.entity.Product;
import com.bootup.ms.service.ProductService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductRestController {

	@Autowired
	ProductService ps;
	
	@GetMapping("/products")
	public List<Product> getAllProducts()
	{
		return ps.findAll();
	}
	
	@GetMapping("/products/{id}")
	public Product getProductById(@PathVariable("id") int id)
	{
		return ps.findById(id);
		
	}
	
	@GetMapping("/products/byName/{wildcardString}")
	public List<Product> getProductsByNameContaining(@PathVariable("wildcardString") String wildcardString)
	{
		return ps.findByNameContaining(wildcardString);
	}
	
	@PostMapping("/products")
	public Product postProduct(@RequestBody Product prod1)
	{
		ps.save(prod1);
		return prod1;
	}
	
	@PostMapping("/products/all")
	public List<Product> postAllProducts(@RequestBody List<Product> prodList)
	{
		ps.saveAll(prodList);
		return prodList;
	}
}
