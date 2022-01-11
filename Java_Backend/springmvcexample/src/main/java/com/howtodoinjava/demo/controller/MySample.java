package com.howtodoinjava.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.howtodoinjava.demo.model.EmployeeVO;

@Controller
@RequestMapping("/test")
public class MySample{
	
	
	@RequestMapping(value = "/testHello", method = RequestMethod.GET)
	public String testHello(Model model) {
		model.addAttribute("NAME","FARAAZ");
		model.addAttribute("Sir_name","JAYANTA");
		return "testHello";
	}
}
