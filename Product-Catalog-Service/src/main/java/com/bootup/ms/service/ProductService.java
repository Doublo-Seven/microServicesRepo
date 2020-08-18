package com.bootup.ms.service;

import java.util.List;

import com.bootup.ms.entity.Product;

public interface ProductService {
	
	public Product save(Product prod);
	
	public List<Product> saveAll(List<Product> prodList);
	
	public List<Product> findAll();
	
	public Product findById(int id);
	
	public List<Product> findByNameContaining(String wildcardString);
	
}
