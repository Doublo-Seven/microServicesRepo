package com.bootup.ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootup.ms.entity.Review;
import com.bootup.ms.service.ProductService;
import com.bootup.ms.service.ReviewService;

@RestController
@CrossOrigin
@RequestMapping("/api/products")
public class ReviewRestController {
	
	@Autowired
	ReviewService rvs;
	
	@Autowired
	ProductService ps;
	
	@GetMapping("/{id}/reviews")
	public List<Review> getReviewsforProduct(@PathVariable("id") int id )
	{
		return rvs.getReviewByProdId(id);
	}
	
	@PostMapping("/{id}/reviews")
	public List<Review> postReviewForProduct(@RequestBody Review rv,@PathVariable("id") int id)
	{
		rv.setProdId(ps.findById(id));
		rvs.save(rv);
		return rvs.getReviewByProdId(id);
	}

}