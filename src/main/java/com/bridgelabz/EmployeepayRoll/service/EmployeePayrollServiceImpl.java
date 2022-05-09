package com.bridgelabz.EmployeepayRoll.service;

import com.bridgelabz.EmployeepayRoll.dto.EmployeePayrollDTO;
import com.bridgelabz.EmployeepayRoll.model.EmployeePayrollData;
import com.bridgelabz.EmployeepayRoll.repository.IEmployeePayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class EmployeePayrollServiceImpl implements IEmployeePayrollService{

    @Autowired
    IEmployeePayrollRepository employeeRepository;

    @Override
    public List<EmployeePayrollData> getEmployeePayrollData() {
        List<EmployeePayrollData> employeePayrollDataList = new ArrayList<>();
        employeePayrollDataList.add(new EmployeePayrollData(1,new EmployeePayrollDTO("ChandraKant",40000)));
        return employeePayrollDataList;
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int empId) {
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(empId, new EmployeePayrollDTO("Tom", 30000));
        return employeePayrollData;
    }

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(1, employeePayrollDTO);
        return employeePayrollData;
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(empId, employeePayrollDTO);
        return employeePayrollData;
    }

    @Override
    public void deleteEmployeePayrollData(int empId) {
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(empId,new EmployeePayrollDTO("Shardul",50000));
    }
}
