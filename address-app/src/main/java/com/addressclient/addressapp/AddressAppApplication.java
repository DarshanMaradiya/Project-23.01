package com.addressclient.addressapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AddressAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressAppApplication.class, args);
	}

}
