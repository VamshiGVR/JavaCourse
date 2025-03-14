package com.MangementEmployees.EMS.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="EMPLOYEES")
public class Employee {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;

	@Column(name="EMAIL_ID")
	private String email;
	
	@Column(name="PHONE_NUMBER")
	private String phoneNumber;
	
	//Getter
	public Long getId() {
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
	public void setId(Long i) {
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
	
}


	
