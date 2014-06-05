package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.entity.manytomanyselfjoin.Faculty;
import com.service.manytomanyselfjoin.FacultyService;

@Controller
@RequestMapping("/faculty")
public class FacultyController<T> {
	
	@Autowired
	private FacultyService<Faculty> service;
	
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		service.createFaculty();
		model.addAttribute("message", "Spring 3 MVC Hello LAM");
		return "hello";
	}
}