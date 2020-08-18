package com.bootup.ms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootup.ms.entity.Review;

@Repository
public interface ReviewDao extends JpaRepository<Review, Integer> {

	public List<Review> findByProdId(int prodId);
	
	
}
