package com.bridgeLabz.employeepayroll.entity;

import com.bridgeLabz.employeepayroll.dto.EmployeePayrollDTO;

public class EmployeePayrollData {
    private int employeeId;
    private String name;
    private long salary;

    public EmployeePayrollData(){}

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public EmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO){
        this.employeeId = empId;
        this.name = employeePayrollDTO.name;
        this.salary = employeePayrollDTO.salary;


    }
}
