package com.mahesh.model;

import org.springframework.beans.factory.annotation.Required;

public class Bank {

	private String bankname;
	private String bankaddress;
	private String bankpincode;
	private String bankceo;
	private String bankcountry;

	public Bank() {
		System.out.println("3 Bank Constructor Called.");
	}

	public String getBankname() {
		return bankname;
	}

	@Required
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public String getBankaddress() {
		return bankaddress;
	}

	public void setBankaddress(String bankaddress) {
		this.bankaddress = bankaddress;
	}

	public String getBankpincode() {
		return bankpincode;
	}

	public void setBankpincode(String bankpincode) {
		this.bankpincode = bankpincode;
	}

	public String getBankceo() {
		return bankceo;
	}

	public void setBankceo(String bankceo) {
		this.bankceo = bankceo;
	}

	public String getBankcountry() {
		return bankcountry;
	}

	@Required
	public void setBankcountry(String bankcountry) {
		this.bankcountry = bankcountry;
	}

	public Bank(String bankname, String bankaddress, String bankpincode, String bankceo, String bankcountry) {
		super();
		this.bankname = bankname;
		this.bankaddress = bankaddress;
		this.bankpincode = bankpincode;
		this.bankceo = bankceo;
		this.bankcountry = bankcountry;
	}

	@Override
	public String toString() {
		return "Bank [bankname=" + bankname + ", bankaddress=" + bankaddress + ", bankpincode=" + bankpincode
				+ ", bankceo=" + bankceo + ", bankcountry=" + bankcountry + "]";
	}

	public void dispBankDetails() {
		System.out.println("***********Bank Details*******************");
		System.out.println("Bank Name: " + bankname);
		System.out.println("Bank Address: " + bankaddress);
		System.out.println("Bank CEO: " + bankceo);
		System.out.println("Bank Country: " + bankcountry);
		System.out.println("Bank Pincode: " + bankpincode);
	}

}
