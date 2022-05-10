package com.bridgelabz.EmployeepayRoll.repository;

import com.bridgelabz.EmployeepayRoll.model.EmployeePayrollData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IEmployeeDataRepository extends JpaRepository<EmployeePayrollData,Integer> {

    @Query(value = "select * from employee_pay_roll, employee_department where employee_id = id and department = :department",nativeQuery = true)
    List<EmployeePayrollData> findEmployeesByDepartment(String department);
}
