package com.employeeList.Employee.controller;

import com.employeeList.Employee.domain.Employee;
import com.employeeList.Employee.service.EmployeeService;

import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;


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
  public String addForm(){
    return "employee/addEmployee";
  }
  
  @PostMapping("employee/add")
  public String add(@ModelAttribute Employee employee){
    employeeService.addEmployee(employee);
    return "redirect:/employee/view";
  }
  
  @GetMapping("employee/remove")
  public String removeForm(Model model){
    List<Employee> employees = employeeService.findAll();
    model.addAttribute("employees", employees);
    return "employee/removeEmployee";
  }
  
  @PostMapping("employee/remove")
  public String remove(@ModelAttribute Employee employee){
    employeeService.removeEmployee(employee);
    return "redirect:/employee/view";
  }
  
  @GetMapping("employee/update")
  public String updateForm(Model model){
    List<Employee> employees = employeeService.findAll();
    model.addAttribute("employees", employees);
    return "employee/updateEmployee";
  }
  
  @PostMapping("employee/update")
  public String update(@ModelAttribute Employee employee){
    employeeService.updateEmployee(employee);
    return "redirect:/employee/view";
  }
}
