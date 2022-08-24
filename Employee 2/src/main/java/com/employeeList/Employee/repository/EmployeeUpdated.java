package com.employeeList.Employee.repository;

import lombok.Data;

@Data
public class EmployeeUpdated {
  private String Name;
  
  private String Address;
  
  private Long UserId;
  
  public EmployeeUpdated(){
  
  }
  
  public EmployeeUpdated(String Name, String Address, Long UserId){
    this.Name = Name;
    this.Address = Address;
    this.UserId = UserId;
  }
}
