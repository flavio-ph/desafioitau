package com.example.desafioItau;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioItauApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioItauApplication.class, args);
		System.out.println(olaMundo());
	}
	
	public static String olaMundo() {
		return "Olá mundo!";
	}

}
