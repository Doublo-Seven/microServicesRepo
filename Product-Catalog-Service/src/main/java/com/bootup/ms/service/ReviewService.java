package com.bootup.ms.service;

import java.util.List;

import com.bootup.ms.entity.Product;
import com.bootup.ms.entity.Review;

public interface ReviewService {
	
	public Review save(Review rv);
	
	public List<Review> findByProdId(Product prodId);
	
	public List<Review> getReviewByProdId(int pid);

}
