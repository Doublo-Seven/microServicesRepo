package com.bootup.ms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootup.ms.dao.PriceInfoDao;
import com.bootup.ms.entity.PriceInfo;

@Service
public class PriceServiceImpl implements PriceService {
	
	@Autowired
	PriceInfoDao piDao;
	
	@Override
	public double findByProdId(int prodId) {
		// TODO Auto-generated method stub
		return piDao.findByProdId(prodId).getPrice();
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


