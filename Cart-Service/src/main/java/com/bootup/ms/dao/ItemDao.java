package com.bootup.ms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootup.ms.entity.Item;

@Repository
public interface ItemDao extends JpaRepository<Item, Integer> {

}
