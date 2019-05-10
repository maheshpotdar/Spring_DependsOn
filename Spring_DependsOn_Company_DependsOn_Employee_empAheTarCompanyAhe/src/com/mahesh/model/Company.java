package com.mahesh.model;

import org.springframework.beans.factory.annotation.Required;

public class Company {

	private String compname;
	private String compaddress;
	private String comppincode;
	private String generalRevenew;
	private String country;
	private String ceoHomeAddress;

	public Company() {
		System.out.println("1.Company Constructor called.");
	}

	public String getCompname() {
		return compname;
	}

	@Required
	public void setCompname(String compname) {
		this.compname = compname;
	}

	public String getCompaddress() {
		return compaddress;
	}

	@Required
	public void setCompaddress(String compaddress) {
		this.compaddress = compaddress;
	}

	public String getComppincode() {
		return comppincode;
	}

	public void setComppincode(String comppincode) {
		this.comppincode = comppincode;
	}

	public String getGeneralRevenew() {
		return generalRevenew;
	}

	public void setGeneralRevenew(String generalRevenew) {
		this.generalRevenew = generalRevenew;
	}

	public String getCountry() {
		return country;
	}
	
	@Required
	public void setCountry(String country) {
		this.country = country;
	}

	public String getCeoHomeAddress() {
		return ceoHomeAddress;
	}

	public void setCeoHomeAddress(String ceoHomeAddress) {
		this.ceoHomeAddress = ceoHomeAddress;
	}

	public Company(String compname, String compaddress, String comppincode, String generalRevenew, String country,
			String ceoHomeAddress) {
		super();
		this.compname = compname;
		this.compaddress = compaddress;
		this.comppincode = comppincode;
		this.generalRevenew = generalRevenew;
		this.country = country;
		this.ceoHomeAddress = ceoHomeAddress;
	}

	@Override
	public String toString() {
		return "Company [compname=" + compname + ", compaddress=" + compaddress + ", comppincode=" + comppincode
				+ ", generalRevenew=" + generalRevenew + ", country=" + country + ", ceoHomeAddress=" + ceoHomeAddress
				+ "]";
	}

}
