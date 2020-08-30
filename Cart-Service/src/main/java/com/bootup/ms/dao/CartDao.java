package com.bootup.ms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootup.ms.entity.Cart;

@Repository
public interface CartDao extends JpaRepository<Cart, Integer> {

	public Cart findByCartId(int cartId);
	
	public Cart findByCustName(String custName);
}
