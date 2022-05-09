package com.bridgelabz.EmployeepayRoll.controller;

import com.bridgelabz.EmployeepayRoll.entity.EmployeePayrollEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pay_roll_services")
public class EmployeePayrollController {

    @RequestMapping(value = { "/get"})
    public ResponseEntity<String> getEmployeeData() {
        return new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
    }

    @GetMapping("/get/{empId}")
    public ResponseEntity<String> getEmployeePayrolIData(@PathVariable(value = "empId") int empId) {
        return new ResponseEntity<String>("Get Call Success for id: " + empId, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addEmployeePayrollData(@RequestBody EmployeePayrollEntity employeePayrollEntity) {
        return new ResponseEntity<String>("Created Employee Payroll Data for: " + employeePayrollEntity, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateEmployeePayrollData(@RequestBody EmployeePayrollEntity employeePayrollEntity){
        return new ResponseEntity<String>("Updated Employee Payroll Data for: "+employeePayrollEntity, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<String> deleteEmployeePayrollData(@PathVariable("empId") int empId) {
        return new ResponseEntity<String>("Delete Call Success for id: " + empId, HttpStatus.OK);
    }
}
