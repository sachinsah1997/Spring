package com.sachinsah.corona.cases.tracker.models;

public class CoronaCasesData {

	private String countryCode;
	private String continent;
	private String location;
	private String population;
	private String lastUpdatedDate;
	private String newCases;
	private String newDeaths;
	private String totalDeaths;
	private String totalCases;
	private String totalVaccinations;
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPopulation() {
		return population;
	}
	public void setPopulation(String population) {
		this.population = population;
	}
	public String getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	public void setLastUpdatedDate(String lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
	public String getNewCases() {
		return newCases;
	}
	public void setNewCases(String newCases) {
		this.newCases = newCases;
	}
	public String getNewDeaths() {
		return newDeaths;
	}
	public void setNewDeaths(String newDeaths) {
		this.newDeaths = newDeaths;
	}
	public String getTotalDeaths() {
		return totalDeaths;
	}
	public void setTotalDeaths(String totalDeaths) {
		this.totalDeaths = totalDeaths;
	}
	public String getTotalCases() {
		return totalCases;
	}
	public void setTotalCases(String totalCases) {
		this.totalCases = totalCases;
	}
	public String getTotalVaccinations() {
		return totalVaccinations;
	}
	public void setTotalVaccinations(String totalVaccinations) {
		this.totalVaccinations = totalVaccinations;
	}
	
	@Override
	public String toString() {
		return "CoronaCasesData [countryCode=" + countryCode + ", continent=" + continent + ", location=" + location
				+ ", population=" + population + ", lastUpdatedDate=" + lastUpdatedDate + ", newCases=" + newCases
				+ ", newDeaths=" + newDeaths + ", totalDeaths=" + totalDeaths + ", totalCases=" + totalCases
				+ ", totalVaccinations=" + totalVaccinations + "]";
	}
	
	
}
