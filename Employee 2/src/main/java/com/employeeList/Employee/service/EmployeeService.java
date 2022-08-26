package com.employeeList.Employee.service;

import com.employeeList.Employee.domain.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
  
  Optional<Employee> findById(Long id);
  
  List<Employee> findAll();
  
}