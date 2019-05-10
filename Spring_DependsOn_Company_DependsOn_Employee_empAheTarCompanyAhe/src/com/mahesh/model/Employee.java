package com.mahesh.model;

import org.springframework.beans.factory.annotation.Required;

public class Employee {

	private String empname;
	private String salary;

	private Company company;

	public Employee() {
		System.out.println("2.Employee Constructor called.");
	}

	public String getEmpname() {
		return empname;
	}

	@Required
	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Company getCompany() {
		return company;
	}

	@Required
	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", salary=" + salary + ", company=" + company + "]";
	}

	public Employee(String empname, String salary, Company company) {
		super();
		this.empname = empname;
		this.salary = salary;
		this.company = company;
	}

	public void infoEmpComp() {
		System.out.println("**********Employee Info********************\n");
		System.out.println("Employee Name: " + empname + " Salary:" + salary);

		System.out.println("***********Company Info********************\n");
		System.out.println("Company Name: " + company.getCompname());
		System.out.println("Company Country: " + company.getCountry());
		System.out.println("Company CeoHome: " + company.getCeoHomeAddress());
		System.out.println("Company Address: " + company.getCompaddress());
		System.out.println("Company Country: " + company.getCountry());
		System.out.println("Company Pincode: " + company.getComppincode());
		System.out.println("Company General Revenew: " + company.getGeneralRevenew());
	}

}
