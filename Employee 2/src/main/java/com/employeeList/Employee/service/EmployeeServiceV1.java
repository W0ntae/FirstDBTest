package com.employeeList.Employee.service;

import com.employeeList.Employee.domain.Employee;
import com.employeeList.Employee.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class EmployeeServiceV1 implements EmployeeService{
  
  private final EmployeeRepository employeeRepository;
  @Override
  public List<Employee> findAll() {
    return employeeRepository.findAll();
  }
  
  @Override
  public void insertEmployee(String name, String address) {
  
  }
  
  @Override
  public Employee selectEmployee(Long id) {
    return null;
  }
  
  @Override
  public void updateEmployee(Long id) {
  
  }
}
