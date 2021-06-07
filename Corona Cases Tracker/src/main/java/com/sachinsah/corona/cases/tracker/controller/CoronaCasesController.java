package com.sachinsah.corona.cases.tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.sachinsah.corona.cases.tracker.models.CoronaCasesData;
import com.sachinsah.corona.cases.tracker.services.CoronaCasesDataService;

@Controller
public class CoronaCasesController {
	
	@Autowired
	CoronaCasesDataService coronaCasesDataService;
	
	@GetMapping("/coronatrackerapp")
	public String controllerMethod(Model model) {
		
		double sum=0;
		for(CoronaCasesData ccd : coronaCasesDataService.getAllStats()) {
			if(ccd.getNewCases() != "") {
				sum += Double.parseDouble(ccd.getNewCases());
			}
		}
		
		model.addAttribute("todayCase", sum);
		model.addAttribute("stats", coronaCasesDataService.getAllStats());
		return "index";
	}
	  
}
