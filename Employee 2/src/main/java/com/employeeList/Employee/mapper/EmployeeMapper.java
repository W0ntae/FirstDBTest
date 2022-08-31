package com.employeeList.Employee.mapper;

import com.employeeList.Employee.domain.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface EmployeeMapper {
  void add(@Param("name") String name,@Param("address") String address);
  
  void update(@Param("id") Long id, @Param("name") String name, @Param("address") String address);
  
  List<Employee> findEmployees();
  
  Optional<Employee> findById(Long id);
  
  void delete(@Param("UserId") Long UserId);
}
