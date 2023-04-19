package com.ssk.OneToOneBiDirectionalAssociationMapping.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssk.OneToOneBiDirectionalAssociationMapping.entities.Employee;
import com.ssk.OneToOneBiDirectionalAssociationMapping.repos.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository empRepo;

	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return empRepo.findAll();
	}
}
