package com.example.transportmanagementapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class TransportManagementAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransportManagementAppApplication.class, args);
	}

}
