package com.uinversity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public ResponseEntity<Void> saveUniversity(@RequestBody UniversityModel universityModel) {
		universityService.saveUinversity(universityModel);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@GetMapping("/getUni/{name}")
	public UniversityModel getUniversityDetails(@PathVariable("name") String name) {
		return universityService.getUniversity(name);
	}

	@DeleteMapping("/deleteUni/{name}")
	public ResponseEntity<Void> deleteUniversity(@PathVariable("name") String name) {
		universityService.deleteUinversity(name);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

	@PatchMapping("/modify")
	public ResponseEntity<Void> modifyUniversity(@RequestBody UniversityModel universityModel) {
		universityService.updateUinversity(universityModel);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

	@GetMapping("/getList")
	public List<UniversityModel> getUniversities() {
		return universityService.getUniversites();
	}

}
