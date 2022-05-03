package com.lions.gym.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lions.gym.dao.GymEmployeeDao;
import com.lions.gym.model.GymEmployee;

@Service
public class EmployeeServiceImp implements EmployeeService{
	
	@Autowired
	private GymEmployeeDao gymEmployeeDao;

	@Override
	public String createEmployee(GymEmployee gymEmployee) {
		gymEmployeeDao.save(gymEmployee);
		return "Gym Employee added successfully";
	}

	@Override
	public List<GymEmployee> getGymEmployees() {
		return gymEmployeeDao.findAll();
	}

}
