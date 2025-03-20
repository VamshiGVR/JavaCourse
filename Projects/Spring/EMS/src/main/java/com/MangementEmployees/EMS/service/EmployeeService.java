package com.MangementEmployees.EMS.service;

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
	
	public Employee createEmployee(Employee employee) {
		System.out.println("Emploeyee Created");		
		return employeeRepository.save(employee);
	}
	
	public Employee readEmployee(Employee employee) {
		return employeeRepository.findById(employee.getId()).orElseThrow(()-> new RuntimeException("Employee not found"));
	}
	
	public List<Employee> readEmployees() {
		return employeeRepository.findAll();
	}
	
	public String updateEmployee(Employee employee) {
		Employee existEmployee = employeeRepository.findById(employee.getId()).orElseThrow(()-> new RuntimeException("Employee not found"));
		existEmployee.setFirstName(employee.getFirstName());
		existEmployee.setLastName(employee.getLastName());
		existEmployee.setEmail(employee.getEmail());
		existEmployee.setPhoneNumber(employee.getPhoneNumber());
		employeeRepository.save(existEmployee);
		return "updated for employee ID:" + employee.getId()+".";
	}
	
	public String deleteEmployee(Employee employee) {
		Employee delEmployee = employeeRepository.findById(employee.getId()).orElseThrow(()-> new RuntimeException("Employee not found"));
		employeeRepository.delete(delEmployee);
		return "Deleted Employee with ID:" + employee.getId()+".";
	}
}
