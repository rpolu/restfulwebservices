package com.elegant.spring.rest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.elegant.spring.rest.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
}