package com.employeeList.Employee.config;


import com.employeeList.Employee.mapper.EmployeeMapper;
import com.employeeList.Employee.repository.EmployeeRepository;
import com.employeeList.Employee.repository.MybatisEmployeeRepository;
import com.employeeList.Employee.service.EmployeeService;
import com.employeeList.Employee.service.EmployeeServiceV1;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class MyBatisConfig {
  
  private final EmployeeMapper employeeMapper;
  
  @Bean
  public EmployeeService employeeService() {
    return new EmployeeServiceV1(employeeRepository());
  }
  
  @Bean
  public EmployeeRepository employeeRepository() {
    return new MybatisEmployeeRepository(employeeMapper);
  }
}
