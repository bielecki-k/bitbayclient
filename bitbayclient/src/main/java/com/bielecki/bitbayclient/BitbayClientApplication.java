package com.bielecki.bitbayclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.io.IOException;

//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class BitbayClientApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(BitbayClientApplication.class, args);

		HttpClientGetRequest.makeRequest();
	}

}
