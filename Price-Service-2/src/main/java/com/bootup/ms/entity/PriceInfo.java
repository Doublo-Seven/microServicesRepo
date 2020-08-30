package com.bootup.ms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PriceInfo {
	
	@Id
	private int prodId;
	private double price;
	
	
	public PriceInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public PriceInfo(int prodId, double price) {
		super();
		this.prodId = prodId;
		this.price = price;
	}


	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
