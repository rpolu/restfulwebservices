package com.uinversity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uinversity.model.UniversityModel;
import com.uinversity.service.UniversityService;

@RestController
@RequestMapping("/university")
public class UniversityController {

	@Autowired
	private UniversityService universityService;

	@PostMapping("/save")
	public String saveUniversity(@RequestBody UniversityModel universityModel) {
		universityService.saveUinversity(universityModel);
		return universityModel.getName();
	}

}
