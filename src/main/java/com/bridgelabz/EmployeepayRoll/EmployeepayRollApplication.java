package com.bridgelabz.EmployeepayRoll;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
@Slf4j
public class EmployeepayRollApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeepayRollApplication.class, args);

		System.out.println("***********Welcome to Employee PayRoll Services************");
		log.info("Employee payroll app started");
	}

}
