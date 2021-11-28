package com.ascentpro.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ascentpro.employeemanagement.model.Department;

@Repository
public interface DepartmentRepository extends  JpaRepository<Department, Long> {

}
