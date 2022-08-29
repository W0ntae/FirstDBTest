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
  public void addEmployee(String name, String address) {
    employeeMapper.add(name, address);
  }
  
  @Override
  public void update(Long UserId, String name, String address) {
    employeeMapper.update(UserId, name, address);
  }
  
  @Override
  public Optional<Employee> findByID(Long id) {
    return employeeMapper.findById(id);
  }
  
  @Override
  public List<Employee> findAll() {
    return employeeMapper.findEmployees();
  }
  
  @Override
  public void removeEmployee(Long UserId) {
    employeeMapper.delete(UserId);
  }
}
