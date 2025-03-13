package com.MangementEmployees.EMS.service;

import org.springframework.stereotype.Service;

import com.MangementEmployees.EMS.entity.Employee;
import com.MangementEmployees.EMS.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	private EmployeeRepository employeeRepository;
	
	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;	
	}
	
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
}
