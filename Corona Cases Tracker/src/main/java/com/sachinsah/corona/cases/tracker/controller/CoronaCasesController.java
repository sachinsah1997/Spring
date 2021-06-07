package com.sachinsah.corona.cases.tracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CoronaCasesController {
	
	@GetMapping("/")
	public String controllerMethod() {
		return "index";
	}
	  
}
