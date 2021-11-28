package com.ascentpro.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ascentpro.employeemanagement.model.Department;
import com.ascentpro.employeemanagement.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@PostMapping("/SaveDepartment")
	public Department SaveDepartment(@RequestBody Department department) {
		return departmentService.saveDepartment(department);
	}

	@GetMapping("/getAllDepartments")
	public List<Department> getDepartmentList() {
		return departmentService.getDepartmentList();
	}

	@GetMapping("/getDepartment/{id}")
	public Department getDepartmentById(@PathVariable("id") Long departmentId) {
		return departmentService.getDepartmentById(departmentId);
	}

}
