package com.bootup.ms.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootup.ms.controller.Sender;
import com.bootup.ms.dao.ProductDao;
import com.bootup.ms.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao prodDao;
	
	@Autowired
	Sender sender;
	
	@Override
	public List<Product> findAll() {
		return prodDao.findAll();
	}
	
	@Override
	public Product findById(int id) {
		
		Product p1 = prodDao.findById(id);
		Map<String,Object> idAndPrice = new HashMap<>();
		idAndPrice.put("PRODUCT_ID", p1.getProdId());
		idAndPrice.put("PRICE",p1.getPrice());
		
		sender.send(idAndPrice);
		return p1;
	}

	@Override
	public List<Product> findByNameContaining(String wildcardString) {
		return prodDao.findByNameContaining(wildcardString);
	}

	@Override
	public Product save(Product prod) {
		// TODO Auto-generated method stub
		return prodDao.save(prod);
	}

	@Override
	public List<Product> saveAll(List<Product> prodList) {
		// TODO Auto-generated method stub
		return prodDao.saveAll(prodList);
	}

}
