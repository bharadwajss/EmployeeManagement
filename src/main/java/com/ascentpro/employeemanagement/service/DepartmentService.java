package com.ascentpro.employeemanagement.service;

import java.util.List;

import com.ascentpro.employeemanagement.model.Department;

public interface DepartmentService {

	Department saveDepartment(Department department);
	
	List<Department> getDepartmentList();
	
	Department getDepartmentById(Long departmentId);

	String deleteDepartmentById(Long departmentId);
}
