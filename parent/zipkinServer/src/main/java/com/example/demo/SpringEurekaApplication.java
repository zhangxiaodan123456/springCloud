package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;


@SpringBootApplication
@EnableZipkinServer
public class SpringEurekaApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaApplication.class, args);
	}
	
	
	
	
}
