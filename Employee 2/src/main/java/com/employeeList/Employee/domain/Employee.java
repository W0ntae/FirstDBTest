package com.employeeList.Employee.domain;

import lombok.Data;

@Data
public class Employee {
  Long UserId;
  String name;
  String address;
  
  public Employee(){
  }
  
  public Employee(String name, String address){
    this.name = name;
    this.address = address;
  }
  
  public Employee(String UserId){
    this.UserId = Long.valueOf(UserId);
  }
  
  public Employee(String UserId, String name, String address){
    this.UserId = Long.valueOf(UserId);
    this.name = name;
    this.address = address;
  }
}
