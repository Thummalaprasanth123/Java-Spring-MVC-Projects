package com.tcs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@RestController
@Controller
@ResponseBody
public class TestController {
	@RequestMapping("/info")
	public String info()
	{	return "Ratan sir is great....";
	}
	
	@RequestMapping("/show/{name}")
	public String show(@PathVariable String name)
	{	return "Who is the best teacher...."+name;
	}
	
}
