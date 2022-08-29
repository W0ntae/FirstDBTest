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
  private Employee employee;
  
  @Override
  public Optional<Employee> findById(Long id) {
    return employeeRepository.findByID(id);
  }
  
  @Override
  public List<Employee> findAll() {
    return employeeRepository.findAll();
  }
  
  @Override
  public void addEmployee(Employee employee) {
    String employeeName = employee.getName();
    String employeeAddress = employee.getAddress();
    employeeRepository.addEmployee(employeeName,employeeAddress);
  }
  
  @Override
  public void removeEmployee(Employee employee) {
    employeeRepository.removeEmployee(employee.getUserId());
  }
  
  @Override
  public void updateEmployee(Employee employee) {
    employeeRepository.update(employee.getUserId(), employee.getName(), employee.getAddress());
  }
}
