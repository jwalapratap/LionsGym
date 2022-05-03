package com.lions.gym.services;

import java.util.List;

import com.lions.gym.model.GymInventory;

public interface InventoryService {
	
	public String createInventory(GymInventory gymInventory);
	
	public List<GymInventory> getGymInventories();

}
