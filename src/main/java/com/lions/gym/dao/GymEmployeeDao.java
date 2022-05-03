package com.lions.gym.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lions.gym.model.GymEmployee;

public interface GymEmployeeDao extends JpaRepository<GymEmployee, Integer> {

}
