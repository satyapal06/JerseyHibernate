package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.entity.onetomanyselfjoin.Labour;
import com.service.onetomanyselfjoin.LabourService;

@Controller
@RequestMapping("/labour")
public class LabourController<T> {
	
	@Autowired
	private LabourService<Labour> service;
	
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		service.createLabour();
		model.addAttribute("message", "Spring 3 MVC Hello LAM");
		return "hello";
	}
}