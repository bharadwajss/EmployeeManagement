package com.ascentpro.employeemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ascentpro.employeemanagement.model.Department;
import com.ascentpro.employeemanagement.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);

	}

	@Override
	public List<Department> getDepartmentList() {
		return departmentRepository.findAll();
	}

	@Override
	public Department getDepartmentById(Long departmentId) {
		return departmentRepository.findById(departmentId).orElse(null);
	}

	@Override
	public String deleteDepartmentById(Long departmentId) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
