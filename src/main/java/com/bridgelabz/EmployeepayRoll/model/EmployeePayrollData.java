package com.bridgelabz.EmployeepayRoll.model;

import com.bridgelabz.EmployeepayRoll.dto.EmployeePayrollDTO;
import lombok.*;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeePayrollData {


    private int employeeId;
    private String name;
    private long salary;
    private String gender;
    private String notes;
    private String profilePic;
    private List<String> departments;
    private LocalDate startDate;

    public EmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO){
        this.employeeId=empId;
        this.name=employeePayrollDTO.name;
        this.salary=employeePayrollDTO.salary;
        this.gender=employeePayrollDTO.gender;
        this.startDate=employeePayrollDTO.startDate;
        this.notes=employeePayrollDTO.notes;
        this.profilePic=employeePayrollDTO.profilePic;
        this.departments=employeePayrollDTO.departments;
    }
}
