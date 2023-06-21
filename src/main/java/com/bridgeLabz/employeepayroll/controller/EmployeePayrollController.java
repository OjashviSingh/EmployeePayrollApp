package com.bridgeLabz.employeepayroll.controller;

import com.bridgeLabz.employeepayroll.dto.EmployeePayrollDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeepayrollapp")
public class EmployeePayrollController {
    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<String> getEmployeePayrollData(){
        return new ResponseEntity<String>("Get call successful", HttpStatus.OK);
    }
    @GetMapping("/get/{empId}")
    public ResponseEntity<String> getEmployeePayrollData(@PathVariable("empId") int empId){
        return new ResponseEntity<String>("Get call for ID Successfull "+empId, HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<String> addEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO){
        return new ResponseEntity<String>("Created Employee Payroll Data Successfully" +employeePayrollDTO, HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<String> updateEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO){
      return new ResponseEntity<String>("Updated Employee Payroll Data Successfully", HttpStatus.OK);
    }
    @DeleteMapping("/delete/{empId}")
    public RequestEntity<String> deleteEmployeePayrollData(@PathVariable("empId") int empId){
        return new RequestEntity<String>("Deleted Successfully id: "+empId, HttpStatus.OK);
    }
}