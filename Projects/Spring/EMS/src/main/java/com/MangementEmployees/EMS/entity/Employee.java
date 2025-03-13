package com.MangementEmployees.EMS.entity;

import com.MangementEmployees.EMS.repository.EmployeeRepository;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="EMPLOYEES")
public class Employee {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;

	@Column(name="EMAIL_ID", unique =true)
	private String email;
	
	@Column(name="PHONE_NUMBER")
	private String phoneNumber;
	
	//Getter
	public int getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	//Setter
	public void setId(int i) {
		this.id= i;
	}
	
	public void setFirstName(String firstName) {
		this.firstName =firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName =lastName;
	}
	
	public void setEmail(String email) {
		this.email =email;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber =phoneNumber;
	}
	
	
	
	private EmployeeRepository employeeRepository;
	
	public Employee(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	public void addEmploye() {
		Employee employee = new Employee(employeeRepository);
		employee.setId(1);
		employee.setFirstName("MU");
		employee.setLastName("MU");
		employee.setEmail("MUMU@gmail.com1");
		employee.setPhoneNumber("1231231234");
		employeeRepository.save(employee);
		}

	}


	
