package com.lions.gym.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lions.gym.dao.GymInventoryDao;
import com.lions.gym.model.GymInventory;

@Service
public class InventoryServiceImp implements InventoryService{
	
	@Autowired
	private GymInventoryDao gymInventoryDao;

	@Override
	public String createInventory(GymInventory gymInventory) {
		gymInventoryDao.save(gymInventory);
		return "Gym inventory added successfully";
	}

	@Override
	public List<GymInventory> getGymInventories() {
		return gymInventoryDao.findAll();
	}

}
