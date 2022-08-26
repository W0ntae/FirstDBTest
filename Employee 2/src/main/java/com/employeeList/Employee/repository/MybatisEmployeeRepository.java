package com.employeeList.Employee.repository;

import com.employeeList.Employee.domain.Employee;
import com.employeeList.Employee.mapper.EmployeeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class MybatisEmployeeRepository implements EmployeeRepository{
  private final EmployeeMapper employeeMapper;
  
  
  @Override
  public Employee save(Employee employee) {
    employeeMapper.add(employee);
    return employee;
  }
  
  @Override
  public void update(Long UserID, EmployeeUpdated updateParam) {
    employeeMapper.update(UserID, updateParam);
  }
  
  @Override
  public Optional<Employee> findByID(Long id) {
    return employeeMapper.findById(id);
  }
  
  @Override
  public List<Employee> findAll() {
    return employeeMapper.findEmployees();
  }
}
