package com.employeeList.Employee.repository;

import com.employeeList.Employee.domain.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository {
  void addEmployee(String name, String address);
  
  void update(Long UserId, String name, String address);
  
  Optional<Employee> findByID(Long id);
  
  List<Employee> findAll();
  
  void removeEmployee(Long UserId);
}
