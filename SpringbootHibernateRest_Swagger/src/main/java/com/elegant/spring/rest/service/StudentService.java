package com.elegant.spring.rest.service;

import java.util.List;
import java.util.Optional;

import com.elegant.spring.rest.model.Student;


public interface StudentService {

	public List<Student> getAllStudents();
	
	Optional<Student> getStudentById(Long studentId);
	
	Student createStudent(Student student);
	
	Student updateStudent(Student student, Long studentId);
	
	void deleteStudent(Long studnetId);
	
}
