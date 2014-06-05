package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.entity.FirstEntity;
import com.service.FirstService;

@Controller
@RequestMapping("/hi")
public class FirstController<T> {
	
	@Autowired
	private FirstService<FirstEntity> service;
	
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Spring 3 MVC Hello LAM");
		return service.getView();
	}
}