package com.shiva.stack;

import java.net.URI;
import java.util.Scanner;

import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class StackOverflowIntegrationShivaApplication {

	public static void main(String[] args) {
		SpringApplication.run(StackOverflowIntegrationShivaApplication.class, args);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your search query :");
		String intitle = sc.nextLine();
		
		HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory(
				HttpClientBuilder.create().build());
		RestTemplate restTemplate = new RestTemplate(clientHttpRequestFactory);
		StringBuilder builder = new StringBuilder(
				"https://api.stackexchange.com/2.2/search?order=desc&sort=activity&site=stackoverflow&intitle=");
		builder.append(intitle);
		URI uri = URI.create(builder.toString());
		MainObject a = restTemplate.getForObject(uri, MainObject.class);
		System.out.println(a);
		sc.close();
	}
}
