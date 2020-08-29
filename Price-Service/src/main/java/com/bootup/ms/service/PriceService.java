package com.bootup.ms.service;

import com.bootup.ms.entity.PriceInfo;
import com.bootup.ms.entity.Product;

public interface PriceService {
	
	public Product findByProdId(int prodId);
	
	public PriceInfo save(int prodId, double price);
}
