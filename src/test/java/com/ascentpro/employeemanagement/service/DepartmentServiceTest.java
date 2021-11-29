package com.ascentpro.employeemanagement.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.ascentpro.employeemanagement.model.Department;
import com.ascentpro.employeemanagement.repository.DepartmentRepository;

@SpringBootTest
class DepartmentServiceTest {

	@Autowired
	private DepartmentService departmentService;

	@MockBean
	private DepartmentRepository departmentRepository;

	@BeforeEach
	void setup() {
		Department department = Department.builder().departmentName("IT").departmentAddress("Banglore")
				.departmentCode("Testing").departmentId(1L).build();
		Mockito.when(departmentRepository.findByDepartmentName("IT")).thenReturn(department);

	}

	@Test
	public void whenValidDepartmentNameThenDepartmentShouldFound() {
		String departmentName = "IT";
		Department found = departmentService.findBydepartmentName(departmentName);
		assertEquals(departmentName, found.getDepartmentName());

	}

	/*
	 * @Test void testSaveDepartment() { fail("Not yet implemented"); }
	 * 
	 * @Test void testGetDepartmentList() { fail("Not yet implemented"); }
	 * 
	 * @Test void testGetDepartmentById() { fail("Not yet implemented"); }
	 * 
	 * @Test void testDeleteDepartmentById() { fail("Not yet implemented"); }
	 * 
	 * @Test void testUpdateDepartment() { fail("Not yet implemented"); }
	 */

}
