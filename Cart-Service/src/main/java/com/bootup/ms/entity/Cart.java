package com.bootup.ms.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cartId;
	private String custName;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "itemId")
	private Item itemId;
	
	private int qty;
	
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(String custName, Item itemId, int qty) {
		super();
		this.custName = custName;
		this.itemId = itemId;
		this.qty = qty;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Item getItemId() {
		return itemId;
	}

	public void setItemId(Item itemId) {
		this.itemId = itemId;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qtyId) {
		this.qty = qtyId;
	}

	public int getCartId() {
		return cartId;
	}

	
	
}
