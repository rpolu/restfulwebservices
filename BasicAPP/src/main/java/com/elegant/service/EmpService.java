package com.elegant.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.elegnat.model.Employee;

@Service
public class EmpService {

	public List<Employee> getEmpList() {
		List<Employee> al = new ArrayList<Employee>();
		Employee e1 = new Employee();
		e1.setEmpId(10);
		e1.setName("anup");
		e1.setSalary(9000.89f);

		Employee e2 = new Employee();
		e2.setEmpId(11);
		e2.setName("rama");
		e2.setSalary(9000.89f);

		Employee e3 = new Employee();
		e3.setEmpId(10);
		e3.setName("rama");
		e3.setSalary(9000.89f);

		al.add(e1);
		al.add(e2);
		al.add(e3);
		return al;
	}

	public Employee getEmpDeatails() {
		Employee e1 = new Employee();
		e1.setEmpId(10);
		e1.setName("anup");
		e1.setSalary(9000.89f);
		return e1;
	}

}
