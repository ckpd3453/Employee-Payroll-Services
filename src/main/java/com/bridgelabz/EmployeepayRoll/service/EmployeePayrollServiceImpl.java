package com.bridgelabz.EmployeepayRoll.service;

import com.bridgelabz.EmployeepayRoll.dto.EmployeePayrollDTO;
import com.bridgelabz.EmployeepayRoll.model.EmployeePayrollData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class EmployeePayrollServiceImpl implements IEmployeePayrollService {

    private List<EmployeePayrollData> employeePayrollDataList = new ArrayList<>();


    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        log.info("Adding Employee Data to ArrayList");
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(employeePayrollDataList.size()+1, employeePayrollDTO);
        employeePayrollDataList.add(employeePayrollData);//adds in employee list
        return employeePayrollData;
    }

    @Override
    public List<EmployeePayrollData> getEmployeePayrollData() {
        log.info("Getting the list of Employee Payroll Data");
        return employeePayrollDataList;
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int empId) {
        log.info("Getting Employee Payroll data by ID");
        return employeePayrollDataList.get(empId-1);//as arraylist index is starts from 0
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO) {
        log.info("Editing/Update Employee Payroll data");
        EmployeePayrollData employeePayrollData = this.getEmployeePayrollDataById(empId);
        employeePayrollData.setName(employeePayrollDTO.name);
        employeePayrollData.setSalary(employeePayrollDTO.salary);
        employeePayrollDataList.set(empId-1,employeePayrollData);
        return employeePayrollData;
    }

    @Override
    public void deleteEmployeePayrollData(int empId)
    {
        log.info("Deleting the Employee Payroll Data of given Employee ID");
        employeePayrollDataList.remove(empId-1);
    }
}
