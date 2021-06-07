package com.sachinsah.corona.cases.tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sachinsah.corona.cases.tracker.services.CoronaCasesDataService;

@Controller
public class CoronaCasesController {
	
	@Autowired
	CoronaCasesDataService coronaCasesDataService;
	
	@GetMapping("/")
	public String controllerMethod(Model model) {
		
		model.addAttribute("stats", coronaCasesDataService.getAllStats());
		return "index";
	}
	  
}
