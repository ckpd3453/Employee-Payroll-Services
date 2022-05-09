package com.bridgelabz.EmployeepayRoll.model;

import com.bridgelabz.EmployeepayRoll.dto.EmployeePayrollDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class EmployeePayrollData {
    @Id
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
