package com.howtodoinjava.demo.model;

import java.io.Serializable;

public class Companies implements  Serializable{
	private static final long serialVersionUID = 1L;
	
	private String CompanyName1;
	private String CompanyName2;
	private String CompanyName3;	
	@Override
	public String toString() {
		return "Companies [Company1=" + CompanyName1 + ", Company2="+ CompanyName2 +", company3=" + CompanyName3 +"]";
	}
	public String getCompanyName1() {
		return CompanyName1;
	}
	public void setCompanyName1(String companyName1) {
		CompanyName1 = companyName1;
	}
	public String getCompanyName2() {
		return CompanyName2;
	}
	public void setCompanyName2(String companyName2) {
		CompanyName2 = companyName2;
	}
	public String getCompanyName3() {
		return CompanyName3;
	}
	public void setCompanyName3(String companyName3) {
		CompanyName3 = companyName3;
	}

	
}
