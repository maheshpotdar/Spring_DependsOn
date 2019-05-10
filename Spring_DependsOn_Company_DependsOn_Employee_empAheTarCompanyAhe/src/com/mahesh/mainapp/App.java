package com.mahesh.mainapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mahesh.model.Bank;
import com.mahesh.model.Employee;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/mahesh/resources/spring.xml");

		context.getBean("comp");
		Employee employee = (Employee) context.getBean("emp");
		employee.infoEmpComp();

		Bank bank = (Bank) context.getBean("bank");
		bank.dispBankDetails();

		// check the constructor in console.
		// 1. company
		// 2. bank (employee depends-on bank manaje first bank cha object tayar honar.
		// mag employee cha object tayar honar.)
		// 3. employee.

	}
}
