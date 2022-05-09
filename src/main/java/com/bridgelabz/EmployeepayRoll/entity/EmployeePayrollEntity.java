package com.bridgelabz.EmployeepayRoll.entity;



public class EmployeePayrollEntity {
    public String name;
    public long salary;

    public EmployeePayrollEntity(String name,long salary) {
        this.name = name;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "EmployeePayrollEntity{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
