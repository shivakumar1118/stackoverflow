package com.shiva.stack;

import java.net.URI;

import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyController {
	
	@RequestMapping(value = "stack")
	public MainObject getProductList1(@RequestParam String intitle) {
		HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory(
				HttpClientBuilder.create().build());
		RestTemplate restTemplate = new RestTemplate(clientHttpRequestFactory);
		StringBuilder builder = new StringBuilder(
				"https://api.stackexchange.com/2.2/search?order=desc&sort=activity&site=stackoverflow&intitle=");
		builder.append(intitle);
		URI uri = URI.create(builder.toString());
		MainObject a = restTemplate.getForObject(uri, MainObject.class);
		System.out.println(a);
		return a;
	}
}
