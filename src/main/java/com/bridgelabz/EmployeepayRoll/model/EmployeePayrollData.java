package com.bridgelabz.EmployeepayRoll.model;

import com.bridgelabz.EmployeepayRoll.dto.EmployeePayrollDTO;
import lombok.*;
import lombok.Data;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeePayrollData {

    @Id
    private int employeeId;
    private String name;
    private long salary;

    public EmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO){
        this.employeeId=empId;
        this.name=employeePayrollDTO.name;
        this.salary=employeePayrollDTO.salary;
    }
}
