package com.lions.gym.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lions.gym.model.GymInventory;
import com.lions.gym.services.InventoryService;

@RestController
@RequestMapping("/lionsgym")
public class GymInventoryController {
	
	@Autowired
	private InventoryService inventoryService;
	
	@PostMapping("/addInventory")
	public ResponseEntity<GymInventory> addGymInventory(@RequestBody GymInventory gymInventory) {
		String newGymInventory = inventoryService.createInventory(gymInventory);
		return new ResponseEntity(newGymInventory, HttpStatus.CREATED);
	}

	@GetMapping("/gymInventory")
	public ResponseEntity<List<GymInventory>> getAllGymInventory() {
		List<GymInventory> gymInventories = inventoryService.getGymInventories();
		return new ResponseEntity<>(gymInventories,HttpStatus.OK);
	}
}
