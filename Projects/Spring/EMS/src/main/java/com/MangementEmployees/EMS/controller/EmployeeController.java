package com.MangementEmployees.EMS.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MangementEmployees.EMS.entity.Employee;
import com.MangementEmployees.EMS.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	@PostMapping("/Create")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}
	
	@GetMapping("/Read")
	public Employee readEmployee(@RequestBody Employee employee) {
		return employeeService.readEmployee(employee);
	}
	
	@PutMapping("/Update")
	public String updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);	
	}
	
	@DeleteMapping("/Delete")
	public String deleteEmployee(@RequestBody Employee employee) {
		return employeeService.deleteEmployee(employee);
	}
}
