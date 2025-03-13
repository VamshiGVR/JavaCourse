package com.MangementEmployees.EMS.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.MangementEmployees.EMS.entity.Employee;
import com.MangementEmployees.EMS.service.EmployeeService;


@RestController
@RequestMapping("/Employees")
public class EmployeeController {

	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@PostMapping("/CreateEmployee")
	public String CreateEmployee(@RequestBody List<Employee> Employee) {
		employeeService.CreateEmployees(Employee);
		System.out.print(Employee);
		return "Created";
	}
	
	@GetMapping("/Read")
	public String ReadEmployee(@RequestParam int id) {
		return null;	
	}
	
	@PutMapping("/Update")
	public String UpdateEmployee() {
		return null;	
	}
	
	@DeleteMapping("/Delete")
	public String DeleteEmployee() {
		return null;	
	}
}
