package com.bridgelabz.EmployeepayRoll.service;

import com.bridgelabz.EmployeepayRoll.dto.EmployeePayrollDTO;
import com.bridgelabz.EmployeepayRoll.model.EmployeePayrollData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IEmployeePayrollService {

    List<EmployeePayrollData> getEmployeePayrollData();

    EmployeePayrollData getEmployeePayrollDataById(int empId);

    EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO);

    EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO empPayrollDTO);

    void deleteEmployeePayrollData(int empId);
}
