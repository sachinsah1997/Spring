package com.sachinsah.corona.cases.tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@EnableScheduling
public class CoronaCasesTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronaCasesTrackerApplication.class, args);	
	}
}
