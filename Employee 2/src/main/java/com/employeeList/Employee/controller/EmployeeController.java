package com.employeeList.Employee.controller;

import com.employeeList.Employee.domain.Employee;
import com.employeeList.Employee.service.EmployeeService;

import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Controller
@Data
public class EmployeeController{
  
  private final EmployeeService employeeService;
  
  
  @GetMapping("employee/view")
  public String getAll(Model model){
    List<Employee> employees = employeeService.findAll();
    model.addAttribute("employees", employees);
    return "employee/viewEmployee";
  }
  
  @GetMapping("employee/add")
  public String addEmployee(){
    return "employee/addEmployee";
  }
}
