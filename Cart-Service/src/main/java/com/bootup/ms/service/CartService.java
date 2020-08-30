package com.bootup.ms.service;

import com.bootup.ms.entity.Cart;

public interface CartService {
	
	
	public Cart findByCustName(String custName);
	
	public Cart save(Cart cart);
	
	public Cart saveInfo(String custName, Cart cart);
	

}
