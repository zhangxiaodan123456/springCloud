package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class SpringEurekaApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(SpringEurekaApplication.class).web(true).run(args);
		//SpringApplication.run(SpringEurekaApplication.class, args);
	}
	
	
}
