package com.howtodoinjava.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.howtodoinjava.demo.dao.CompanyDAO;
import com.howtodoinjava.demo.dao.EmployeeDAO;
import com.howtodoinjava.demo.model.Companies;
import com.howtodoinjava.demo.model.EmployeeVO;


@Service 
@Scope("singleton")

public class CompanyMImpl implements CompanyM {
	@Autowired
	CompanyDAO companyDAO;
	
	public CompanyMImpl(CompanyDAO companyDAO2) {
		this.companyDAO = companyDAO2;
	}
	public CompanyMImpl() {
		
	}

	public void setCompanyDAO(CompanyDAO companyDAO) {
		this.companyDAO = companyDAO;
	}
	
	public List<Companies> getAllCompanies()
	{
		return companyDAO.getAllCompanies();
	}

	
	

}
