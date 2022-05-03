package com.lions.gym.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lions.gym.model.GymInventory;

public interface GymInventoryDao extends JpaRepository<GymInventory, Integer> {

}
