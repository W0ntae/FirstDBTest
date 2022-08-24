package com.employeeList.Employee.mapper;

import com.employeeList.Employee.domain.Employee;
import com.employeeList.Employee.repository.EmployeeUpdated;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface EmployeeMapper {
  void save(Employee employee);
  
  void update(@Param("id") Long id, @Param("updateParam") EmployeeUpdated updateParam);
  
  List<Employee> findAll();
  
  Optional<Employee> findById(Long id);
}
