package com.bridgelabz.EmployeepayRoll.service;

import com.bridgelabz.EmployeepayRoll.dto.EmployeePayrollDTO;
import com.bridgelabz.EmployeepayRoll.model.EmployeePayrollData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IEmployeePayrollService {

    List<EmployeePayrollData> getEmployeePayrollData();

    EmployeePayrollData getEmployeePayrollDataById(int empId);

    List<EmployeePayrollData> getEmployeesByDepartment(String department);

    EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO);

    EmployeePayrollData updateEmployeePayrollData(int empId,EmployeePayrollDTO employeePayrollDTO);

    void deleteEmployeePayrollData(int empId);
}
