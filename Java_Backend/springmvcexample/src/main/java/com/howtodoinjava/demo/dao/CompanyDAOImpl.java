package com.howtodoinjava.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.howtodoinjava.demo.model.Companies;
import com.howtodoinjava.demo.model.EmployeeVO;

@Repository
@Scope("singleton")
public class CompanyDAOImpl implements CompanyDAO {
	public List<Companies> getAllCompanies(){
	
	List<Companies> companies = new ArrayList<Companies>();
	
	Companies co1 = new Companies();
	co1.setCompanyName1("IBM");
	companies.add(co1);
	Companies co2 = new Companies();
	co2.setCompanyName2("Cognizant");
	companies.add(co2);
	Companies co3 = new Companies();
	co3.setCompanyName3("TCS");
	companies.add(co3);
	return companies;
	}
	
		
	}


