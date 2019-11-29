package com.elegant.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elegant.springboot.model.StudentModel;

@RestController
@RequestMapping("/v1/student")
public class StudentController {

	@GetMapping(value = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<StudentModel> getStudnets() {
		ArrayList<StudentModel> students = new ArrayList<StudentModel>();
		StudentModel studentModel1 = new StudentModel(1, "rama", 67, "spring");
		StudentModel studentModel2 = new StudentModel(2, "Rudra", 68, "spring");
		StudentModel studentModel3 = new StudentModel(3, "supriya", 69, "spring");
		StudentModel studentModel4 = new StudentModel(4, "pallabi", 70, "spring");
		students.add(studentModel1);
		students.add(studentModel2);
		students.add(studentModel3);
		students.add(studentModel4);
		return students;
	}

	@PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> saveStudent(@RequestBody StudentModel model) {
		System.out.println(model);
		return new ResponseEntity(HttpStatus.CREATED);
	}

}
