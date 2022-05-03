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

import com.lions.gym.model.GymEmployee;
import com.lions.gym.services.EmployeeService;

@RestController
@RequestMapping("/lionsgym")
public class GymEmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/addEmployee")
	public ResponseEntity<GymEmployee> addEmployee(@RequestBody GymEmployee gymEmployee) {
		String newGymEmployee = employeeService.createEmployee(gymEmployee);
		return new ResponseEntity(newGymEmployee, HttpStatus.CREATED);
	}

	@GetMapping("/gymEmployees")
	public ResponseEntity<List<GymEmployee>> getAllGymEmployee() {
		List<GymEmployee> gymEmployees = employeeService.getGymEmployees();
		return new ResponseEntity<>(gymEmployees, HttpStatus.OK);
	}
}
