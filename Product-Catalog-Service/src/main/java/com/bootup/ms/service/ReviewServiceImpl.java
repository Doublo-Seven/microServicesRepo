package com.bootup.ms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootup.ms.dao.ProductDao;
import com.bootup.ms.dao.ReviewDao;
import com.bootup.ms.entity.Product;
import com.bootup.ms.entity.Review;

@Service
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	ReviewDao rvDao;
	
	@Autowired
	ProductDao prodDao;
	
	@Override
	public Review save(Review rv) {
		// TODO Auto-generated method stub
		return rvDao.save(rv);
	}


	@Override
	public List<Review> getReviewByProdId(int pid) {
		List<Review> rv = rvDao.findByProdId(prodDao.findById(pid));
		return rv;
	}


	@Override
	public List<Review> findByProdId(Product prodId) {
		// TODO Auto-generated method stub
		return rvDao.findByProdId(prodId);
	}


}
