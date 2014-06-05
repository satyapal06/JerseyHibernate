package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.entity.onetomanymapping.Employee;
import com.service.onetomanymapping.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController<T> {
	
	@Autowired
	private EmployeeService<Employee> service;
	
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		service.save();
		model.addAttribute("message", "Spring 3 MVC Hello LAM");
		return "hello";
	}
}
