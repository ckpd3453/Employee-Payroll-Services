package com.bridgelabz.EmployeepayRoll.repository;

import com.bridgelabz.EmployeepayRoll.model.EmployeePayrollData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeePayrollRepository extends JpaRepository<EmployeePayrollData, Long> {
}
