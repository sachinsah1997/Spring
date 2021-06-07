package com.sachinsah.corona.cases.tracker.services;

import java.io.IOException;
import java.io.StringReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.sachinsah.corona.cases.tracker.models.CoronaCasesData;

@Service
public class CoronaCasesDataService {

	private static String csvLink = "https://raw.githubusercontent.com/owid/covid-19-data/master/public/data/latest/owid-covid-latest.csv";
	private List<CoronaCasesData> allStats = new ArrayList<>();
	
	public List<CoronaCasesData> getAllStats() {
		return allStats;
	}

	public void setAllStats(List<CoronaCasesData> allStats) {
		this.allStats = allStats;
	}

	@PostConstruct
	@Scheduled(cron = "* * 1 * * *")
	public void fetchDataFromCsv() throws IOException, InterruptedException {

		List<CoronaCasesData> newStats = new ArrayList<>();
		HttpClient client =  HttpClient.newHttpClient();
		HttpRequest request =  HttpRequest.newBuilder().uri(URI.create(csvLink)).build();
		
		HttpResponse<String> httpResponse =  client.send(request, HttpResponse.BodyHandlers.ofString());
		StringReader csvReader = new StringReader(httpResponse.body());
 		Iterable<CSVRecord> records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(csvReader);
		
 		for (CSVRecord record : records) {
			CoronaCasesData ccd = new CoronaCasesData();
			ccd.setCountryCode(record.get("iso_code"));
			ccd.setContinent(record.get("continent"));
			ccd.setLocation(record.get("location"));
			ccd.setPopulation(record.get("population"));
			ccd.setLastUpdatedDate(record.get("last_updated_date"));
			ccd.setNewCases(record.get("new_cases"));
			ccd.setNewDeaths(record.get("new_deaths"));
			ccd.setTotalDeaths(record.get("total_deaths"));
			ccd.setTotalCases(record.get("total_cases"));
			ccd.setTotalVaccinations(record.get("total_vaccinations"));
		    System.out.println(ccd);
		    newStats.add(ccd);    
		}
 		
 		this.allStats = newStats;
	}
}
