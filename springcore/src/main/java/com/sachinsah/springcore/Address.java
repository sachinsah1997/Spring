package com.sachinsah.springcore;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Address {

	private String city;
	private String state;
	private String country;
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + "]";
	}

	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Initializing method called");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Initializing method called");
	}
	
	
}
