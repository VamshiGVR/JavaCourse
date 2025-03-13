package com.MangementEmployees.EMS.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.MangementEmployees.EMS.entity.Employee;
import com.MangementEmployees.EMS.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	private EmployeeRepository employeeRepository;
	
	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	public List<Employee> CreateEmployees(List<Employee> Employee) {
			return employeeRepository.saveAll(Employee);
	}

	public void ReadEmployees(Employee EmployeeDetails) {
		ArrayList<Employee> employee = new ArrayList<>();
		employee.add(EmployeeDetails);
	}
	
	public void UpdateEmployees(Employee EmployeeDetails) {
		ArrayList<Employee> employee = new ArrayList<>();
		employee.add(EmployeeDetails);
	}
	
	public void DeleteEmployees(Employee EmployeeDetails) {
		ArrayList<Employee> employee = new ArrayList<>();
		employee.add(EmployeeDetails);
	}
}
