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
	public void deleteDepartmentById(Long departmentId) {
		departmentRepository.deleteById(departmentId);
	}

	@Override
	public Department updateDepartment(Long departmentId, Department department) {
		// Department departmentDB= departmentRepository.getById(departmentId).get();

		return null;
	}

	@Override
	public Department findBydepartmentName(String departmentName) {
		return departmentRepository.findByDepartmentName(departmentName);
	}

}
