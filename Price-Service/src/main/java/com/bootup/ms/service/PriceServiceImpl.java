package com.bootup.ms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootup.ms.dao.ProductDao;
import com.bootup.ms.entity.Product;

@Service
public class PriceServiceImpl implements PriceService {

	@Autowired
	ProductDao prodDao;
	
	@Override
	public Product findByProdId(int prodId) {
		// TODO Auto-generated method stub
		return prodDao.findByProdId(prodId);
	}

}


