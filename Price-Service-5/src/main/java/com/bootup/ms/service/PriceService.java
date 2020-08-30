package com.bootup.ms.service;

import com.bootup.ms.entity.PriceInfo;

public interface PriceService {
	
	public double findByProdId(int prodId);
	
	public PriceInfo save(int prodId, double price);
}
