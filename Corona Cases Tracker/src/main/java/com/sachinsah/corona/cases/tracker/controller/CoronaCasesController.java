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
		
		double newCase=0,death=0,totalDeath=0,totalCases=0,totalVaccinated=0;
		for(CoronaCasesData ccd : coronaCasesDataService.getAllStats()) {
			if(ccd.getNewCases() != "" && ccd.getNewDeaths() != "" && ccd.getTotalCases() != "" && ccd.getTotalDeaths() != "" && ccd.getTotalVaccinations() != "") {
				newCase += Double.parseDouble(ccd.getNewCases());
				death += Double.parseDouble(ccd.getNewDeaths());
				totalDeath += Double.parseDouble(ccd.getTotalDeaths());
				totalCases += Double.parseDouble(ccd.getTotalCases());
				totalVaccinated += Double.parseDouble(ccd.getTotalVaccinations());
			}
		}
		
		model.addAttribute("newCase", newCase);
		model.addAttribute("death", death);
		model.addAttribute("totalDeath", totalDeath);
		model.addAttribute("totalCases", totalCases);
		model.addAttribute("vaccine", totalVaccinated);
		model.addAttribute("stats", coronaCasesDataService.getAllStats());
		return "index";
	}
	  
}
