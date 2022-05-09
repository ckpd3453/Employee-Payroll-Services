package com.bridgelabz.EmployeepayRoll.model;


import com.bridgelabz.EmployeepayRoll.dto.EmployeePayrollDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeePayrollData {
    private int employeeId;
    private String name;
    private long salary;

    public EmployeePayrollData(){}

    public EmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO){
        this.employeeId=empId;
        this.name=employeePayrollDTO.name;
        this.salary=employeePayrollDTO.salary;
    }
}
