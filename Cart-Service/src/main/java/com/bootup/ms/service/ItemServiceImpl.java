package com.bootup.ms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootup.ms.dao.ItemDao;
import com.bootup.ms.entity.Item;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	ItemDao itemDao;
	
	@Override
	public Item save(Item item) {
		// TODO Auto-generated method stub
		return itemDao.save(item);
	}

}
