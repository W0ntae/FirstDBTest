package com.employeeList.Employee.controller;

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
  
  
  @GetMapping("employees")
  public String getAll(Model model){
    model.addAttribute("employee/viewEmployee", employeeService.findAll());
    
    return "employee/viewEmployee.html";
  }
}
