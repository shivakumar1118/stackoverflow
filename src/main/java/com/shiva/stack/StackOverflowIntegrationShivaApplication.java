package com.shiva.stack;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@SpringBootApplication
public class StackOverflowIntegrationShivaApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(StackOverflowIntegrationShivaApplication.class, args);

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your search query :");
		String intitle = sc.nextLine();
		String encodedIntitle = URLEncoder.encode(intitle, java.nio.charset.StandardCharsets.UTF_8.toString());
		StringBuilder builder = new StringBuilder(
				"https://api.stackexchange.com/2.2/search?order=desc&sort=activity&site=stackoverflow&pageSize=5&intitle=");
		builder.append(encodedIntitle);

		Request request = new Request.Builder().url(builder.toString()).get().build();
		Response response = new OkHttpClient().newCall(request).execute();
		MainObject entity = new ObjectMapper().readValue(response.body().string(), MainObject.class);
		entity.getItems().forEach(list -> System.out.println(list.toString()));
		sc.close();
	}
}
