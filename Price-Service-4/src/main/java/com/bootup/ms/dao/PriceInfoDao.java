package com.bootup.ms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootup.ms.entity.PriceInfo;

public interface PriceInfoDao extends JpaRepository<PriceInfo, Integer> {
	
	public PriceInfo findByProdId(int prodId);

}
