package com.bridgelabz.EmployeepayRoll.model;

import com.bridgelabz.EmployeepayRoll.dto.EmployeePayrollDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;



@Entity
@Table(name = "employee_pay_roll")
@NoArgsConstructor
public @Data class EmployeePayrollData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employee_id")
    private int employeeId;
    @Column(name = "name")
    private String name;
    private long salary;
    private String gender;
    @Column(name = "start_date")
    private LocalDate startDate;
    private String notes;
    @Column(name = "profile_pic")
    private String profilePic;

    @ElementCollection
    @CollectionTable(name = "employee_department", joinColumns = @JoinColumn(name="id"))
    @Column(name = "department")
    private List<String> departments;

    public EmployeePayrollData(EmployeePayrollDTO employeePayrollDTO){
        this.updateEmployeePayrollData(employeePayrollDTO);
    }

    public void updateEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO){
        this.name=employeePayrollDTO.name;
        this.salary=employeePayrollDTO.salary;
        this.gender=employeePayrollDTO.gender;
        this.startDate=employeePayrollDTO.startDate;
        this.notes=employeePayrollDTO.notes;
        this.profilePic=employeePayrollDTO.profilePic;
        this.departments=employeePayrollDTO.departments;
    }
}
