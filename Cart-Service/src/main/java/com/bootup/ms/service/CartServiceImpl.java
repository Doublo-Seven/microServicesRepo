package com.bootup.ms.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Service;

import com.bootup.ms.dao.CartDao;
import com.bootup.ms.dao.ItemDao;
import com.bootup.ms.entity.Cart;
import com.bootup.ms.entity.Item;

@EnableFeignClients
@Service
public class CartServiceImpl implements CartService {
	
	@Autowired
	CartDao cartDao;
	
	@Autowired
	ItemDao itemDao;
	
	@Autowired
	PriceServiceProxy priceProxy;

	@Override
	public Cart findByCustName(String custName) {
		// TODO Auto-generated method stub
		return cartDao.findByCustName(custName);
	}



	@Override
	public Cart saveInfo(String custName, Cart cart) {
		
		Cart c1 = new Cart();
		c1.setCustName(custName);
		Item itm = new Item();
		itm.setItemTotal(cart.getQty() * priceProxy.getPriceOfProduct(cart.getItemId().getItemId()));
		itm.setItemId(cart.getItemId().getItemId());
		itm.setItemName(cart.getItemId().getItemName());
		itm.setItemPrice(priceProxy.getPriceOfProduct(cart.getItemId().getItemId()));
		itm.setCartId(cart);
		itemDao.save(itm);
		c1.setItemId(itm);
		c1.setQty(cart.getQty());
		return save(cart);
	}



	@Override
	public Cart save(Cart cart) {
		// TODO Auto-generated method stub
		return cartDao.save(cart);
	}



}
