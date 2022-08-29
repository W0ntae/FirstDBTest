package com.employeeList.Employee.service;

import com.employeeList.Employee.domain.Employee;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
  
  Optional<Employee> findById(Long id);
  
  List<Employee> findAll();
  
  void addEmployee(Employee employee);
  
  void removeEmployee(Employee employee);
  
  void updateEmployee(Employee employee);
}