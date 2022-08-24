package com.employeeList.Employee.repository;

import com.employeeList.Employee.domain.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository {
  Employee save(Employee employee);
  
  void update(Long UserID, EmployeeUpdated updateParam);
  
  Optional<Employee> findByID(Long id);
  
  List<Employee> findAll();
}
