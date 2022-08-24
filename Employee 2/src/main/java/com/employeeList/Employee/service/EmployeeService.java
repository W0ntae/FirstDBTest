package com.employeeList.Employee.service;

import com.employeeList.Employee.domain.Employee;
import org.apache.ibatis.annotations.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService{
  @Select("select * from testdb.employees")
  List<Employee> findAll();
  
  @Insert("insert into testdb.employees(Name,Address) values (#{name},#{address})")
  void insertEmployee(String name, String address);
  
  @Results({
          @Result(property = "id", column = "UserID"),
          @Result(property = "name", column = "Name"),
          @Result(property = "address", column = "Address")
  })
  @Select("select * from testdb.employees where UserID = #{id}")
  Employee selectEmployee(Long id);
  
  @Update("update testdb.employee set Name = #{name}, Address = #{address} where UserID = #{id}")
  void updateEmployee(Long id);
}
