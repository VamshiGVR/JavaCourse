package com.MangementEmployees.EMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MangementEmployees.EMS.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
