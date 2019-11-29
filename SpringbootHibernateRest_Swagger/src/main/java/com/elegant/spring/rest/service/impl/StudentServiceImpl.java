package com.elegant.spring.rest.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.elegant.spring.rest.model.Student;
import com.elegant.spring.rest.repository.StudentRepository;
import com.elegant.spring.rest.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudents() {

		return (List<Student>) studentRepository.findAll();
	}

	@Override
	public Optional<Student> getStudentById(Long studentId) {

		return studentRepository.findById(studentId);
	}

	@Override
	public Student createStudent(Student student) {

		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(Student student, Long studentId) {

		Student exsistingStudent = ((Optional<Student>) studentRepository.findById(studentId)).get();
		Assert.notNull(exsistingStudent, "Student not available");

		if (student.getName() != null) {
			exsistingStudent.setName(student.getName());
		}
		if (student.getAge() != null) {
			exsistingStudent.setAge(student.getAge());
		}
		if (student.getTelephone() != null) {
			exsistingStudent.setAge(student.getTelephone());
		}
		return studentRepository.save(exsistingStudent);
	}

	@Override
	public void deleteStudent(Long studnetId) {

		studentRepository.deleteById(studnetId);
	}

}
