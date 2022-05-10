package com.bridgelabz.EmployeepayRoll.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class EmployeePayrollDTO {

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee name is Invalid")
    @NotEmpty(message = "Employee name cannot be null")
    public String name;
    @Min(value = 500, message = "min wage should be more than 500")
    public long salary;
    @Pattern(regexp = "male|female", message = "Gender needs to be male or female")
    public String gender;

    @JsonFormat(pattern = "dd MM yyyy")
    @NotNull(message = "Please Enter The Start Date")
    @PastOrPresent(message = "Please Enter Valid Date(i,e. Past or Present)")
    public LocalDate startDate;

    @NotBlank(message = "note should not be empty")
    public String notes;

    @NotBlank(message = "profile pic should not be empty")
    public String profilePic;

    @NotNull(message = "Please Enter the Department")
    public List<String> departments;
}
