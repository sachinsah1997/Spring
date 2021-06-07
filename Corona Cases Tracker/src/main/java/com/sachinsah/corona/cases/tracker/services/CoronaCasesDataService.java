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

	private static String csvLink = "https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_global.csv";
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
		    ccd.setState(record.get("Province/State"));
		    ccd.setCountry(record.get("Country/Region"));
		    ccd.setCurrentCases(Integer.parseInt(record.get(record.size()-1)));
		    System.out.println(ccd);
		    newStats.add(ccd);    
		}
 		
 		this.allStats = newStats;
	}
}
