package com.lions.gym.services;

import java.util.List;

import com.lions.gym.model.GymEmployee;

public interface EmployeeService {
	
	public String createEmployee(GymEmployee gymEmployee);
	
	public List<GymEmployee> getGymEmployees();

}
