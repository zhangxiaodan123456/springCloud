package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
@EnableEurekaClient
@SpringBootApplication
@EnableZuulProxy
public class SpringEurekaApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaApplication.class, args);
	}
	
	
	
	
}
