package com.MangementEmployees.EMS.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MangementEmployees.EMS.entity.Employee;

@RestController
@RequestMapping("/Employees")
public class EmployeeController {
	@PostMapping("Create")
	public String CreateEmployee(List<Employee> employee) {
		return "Created";
	}

}
