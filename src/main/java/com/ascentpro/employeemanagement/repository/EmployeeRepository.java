package com.ascentpro.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ascentpro.employeemanagement.model.Employee;

/**
* @Author: Satish Bharatiya
* Dec 11, 2021
*/
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
