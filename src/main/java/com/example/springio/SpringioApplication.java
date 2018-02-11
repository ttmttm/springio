package com.example.springio;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringioApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("this is a CLI project");
		
	}
}
