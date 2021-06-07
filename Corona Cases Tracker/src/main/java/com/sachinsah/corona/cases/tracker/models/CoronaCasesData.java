package com.sachinsah.corona.cases.tracker.models;

public class CoronaCasesData {

	private String state;
	private String country;
	private int currentCases;
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getCurrentCases() {
		return currentCases;
	}
	public void setCurrentCases(int currentCases) {
		this.currentCases = currentCases;
	}
	@Override
	public String toString() {
		return "CoronaCasesData [state=" + state + ", country=" + country + ", currentCases=" + currentCases + "]";
	}
	
	
}
