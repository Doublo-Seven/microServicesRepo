package com.bootup.ms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootup.ms.entity.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {
	
		
}
