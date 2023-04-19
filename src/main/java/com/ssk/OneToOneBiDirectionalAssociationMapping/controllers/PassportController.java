package com.ssk.OneToOneBiDirectionalAssociationMapping.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssk.OneToOneBiDirectionalAssociationMapping.entities.Passport;
import com.ssk.OneToOneBiDirectionalAssociationMapping.repos.PassportRepository;

@RestController
public class PassportController {

	@Autowired
	PassportRepository passportRepository;
	
	@GetMapping("/passports")
	public List<Passport> getAllPassport() {
		return passportRepository.findAll();
	}
}
