package com.MangementEmployees.EMS.entity;

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

@Getter
@Setter
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
	private String FirstName;
	
	@Column(name="LAST_NAME")
	private String LastName;

	@Column(name="EMAIL_ID", nullable=false, unique =true)
	private String email;
	
	@Column(name="TEL_NO")
	private int phoneNumber;
}
