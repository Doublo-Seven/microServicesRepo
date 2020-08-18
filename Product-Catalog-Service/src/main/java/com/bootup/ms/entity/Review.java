package com.bootup.ms.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Review {
	@Id  
	@GeneratedValue(strategy = GenerationType.AUTO)  
	private int reviewId;  
	private int stars;  
	private String author;  
	private String body;  
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)  
	@JoinColumn(name = "prodId")
	private Product prodId;

	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Review(int stars, String author, String body, Product prodId) {
		super();
		this.stars = stars;
		this.author = author;
		this.body = body;
		this.prodId = prodId;
	}

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Product getProdId() {
		return prodId;
	}

	public void setProdId(Product prodId) {
		this.prodId = prodId;
	}

	public int getReviewId() {
		return reviewId;
	}

	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", stars=" + stars + ", author=" + author + ", body=" + body
				+ ", prodId=" + prodId + "]";
	}
	

}
