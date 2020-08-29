package com.bootup.ms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootup.ms.dao.PriceInfoDao;
import com.bootup.ms.dao.ProductDao;
import com.bootup.ms.entity.PriceInfo;
import com.bootup.ms.entity.Product;

@Service
public class PriceServiceImpl implements PriceService {

	@Autowired
	ProductDao prodDao;
	
	@Autowired
	PriceInfoDao piDao;
	
	@Override
	public Product findByProdId(int prodId) {
		// TODO Auto-generated method stub
		return prodDao.findByProdId(prodId);
	}

	@Override
	public PriceInfo save(int prodId, double price) {
		// TODO Auto-generated method stub
		PriceInfo pi = new PriceInfo();
		pi.setProdId(prodId);
		pi.setPrice(price);
		return piDao.save(pi);
	}

}


