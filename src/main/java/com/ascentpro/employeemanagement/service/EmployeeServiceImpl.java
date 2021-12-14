package com.ascentpro.employeemanagement.service;

import org.springframework.stereotype.Service;

import com.ascentpro.employeemanagement.model.Employee;
import com.ascentpro.employeemanagement.repository.EmployeeRepository;

/**
* @Author: Satish Bharatiya
* Dec 11, 2021
*/
@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepository repository;
	@Override
	public Employee getEmployee(int studentId) {
		// TODO Auto-generated method stub
		return repository.findById(studentId).orElse(null);
	}

}
