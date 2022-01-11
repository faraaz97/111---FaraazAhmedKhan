package com.howtodoinjava.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/Comp")
public class CompanyController {
	
	@RequestMapping(value= "/getAllCompanyNames", method = RequestMethod.GET)
	public String getAllCompanies(Model model) {
		model.addAttribute("Company_1", "IBM");
		model.addAttribute("Company_2", "Cognizant");
		model.addAttribute("Company_3", "TCS");
		return "complist";
		
	}

}
