package com.bootup.ms.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Item {

	@Id
	private int itemId;
	private String itemName;
	private double itemPrice;
	private double itemTotal;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cartId")
	Cart cartId;
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(int itemId, String itemName, double itemPrice, double itemTotal, Cart cartId) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemTotal = itemTotal;
		this.cartId = cartId;
	}

	public double getItemTotal() {
		return itemTotal;
	}

	public void setItemTotal(double itemTotal) {
		this.itemTotal = itemTotal;
	}

	public Cart getCartId() {
		return cartId;
	}


	public void setCartId(Cart cartId) {
		this.cartId = cartId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	
}
