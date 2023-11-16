package com.vivek.springboot.javawebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Homepage {
	
	@RequestMapping("/")
	@ResponseBody
	public String homepage() {
		return "Welcome to homepage";
	}
}
