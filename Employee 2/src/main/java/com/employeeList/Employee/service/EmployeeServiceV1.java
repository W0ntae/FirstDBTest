package com.employeeList.Employee.service;

import com.employeeList.Employee.domain.Employee;
import com.employeeList.Employee.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeServiceV1 implements EmployeeService{
  
  private final EmployeeRepository employeeRepository;
  
  @Override
  public Optional<Employee> findById(Long id) {
    return employeeRepository.findByID(id);
  }
  
  @Override
  public List<Employee> findAll() {
    return employeeRepository.findAll();
  }
}
