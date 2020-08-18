package com.bootup.ms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootup.ms.dao.ProductDao;
import com.bootup.ms.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao prodDao;
	
	@Override
	public List<Product> findAll() {
		return prodDao.findAll();
	}
	
	@Override
	public Product findById(int id) {
		return prodDao.findById(id);
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
