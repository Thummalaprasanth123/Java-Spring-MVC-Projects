package com.tcs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
	@RequestMapping("/add")
	//@RequestMapping("/add")
	public String add(Model model)
	{
		model.addAttribute("num1", 100);
		model.addAttribute("num2", 200);
		return "add";
	
	}
	
}
