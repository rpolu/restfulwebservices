package com.elegant;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elegant.service.EmpService;
import com.elegnat.model.Employee;

@RestController
public class HomeController {

	@Autowired
	private EmpService empService;

	@GetMapping("/getEmp")
	public Employee getEmpDeatails() {
		return empService.getEmpDeatails();
	}

	@GetMapping("/getAllEmp")
	public List<Employee> getAllEmpDeatails() {
		return empService.getEmpList();
	}

}
