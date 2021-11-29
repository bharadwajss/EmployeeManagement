package com.ascentpro.employeemanagement.controller;

import java.util.List;

import javax.validation.Valid;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ascentpro.employeemanagement.custom.exception.BusinessException;
import com.ascentpro.employeemanagement.model.Department;
import com.ascentpro.employeemanagement.service.DepartmentService;

@RestController
public class DepartmentController {

	private final Logger logger = Logger.getLogger(DepartmentController.class);

	@Autowired
	private DepartmentService departmentService;

	@PostMapping("/SaveDepartment")
	public ResponseEntity<Department> SaveDepartment(@Valid @RequestBody Department department) {
		if (department.getDepartmentName().isEmpty() || department.getDepartmentName().length() == 0) {
			throw new BusinessException("601", "please enter proper name. Its blank..");
		}
		// logger.info("Get inside department controller");// logger is not yet
		// implemented..
		Department departmentSaved = departmentService.saveDepartment(department);
		return new ResponseEntity<Department>(departmentSaved, HttpStatus.CREATED);
	}

	@GetMapping("/getAllDepartments")
	public List<Department> getDepartmentList() {
		return departmentService.getDepartmentList();
	}

	@GetMapping("/getDepartment/{id}")
	public Department getDepartmentById(@PathVariable("id") Long departmentId) {
		return departmentService.getDepartmentById(departmentId);
	}

	@DeleteMapping("/deleteById/{id}")
	public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
		departmentService.deleteDepartmentById(departmentId);
		return "Department deleted successfully";
	}

	@PutMapping("/updateById/{id}")
	public Department udpateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department) {
		return departmentService.updateDepartment(departmentId, department);
	}

	@GetMapping("/getDepartment/{name}")
	public Department findByDepartmentName(@PathVariable("name") String departmentName) {
		return departmentService.findBydepartmentName(departmentName);
	}
}
