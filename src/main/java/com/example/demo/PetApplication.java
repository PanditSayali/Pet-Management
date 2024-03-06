package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PetApplication {

	public static void main(String[] args) {
		System.setProperty("server.port","8585");
		SpringApplication.run(PetApplication.class, args);
	}

}
