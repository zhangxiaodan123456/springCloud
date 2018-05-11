package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.SpringEurekaApplication;

@RestController
@RequestMapping("/test")
@RefreshScope
public class TestController{
	
    @Value("${foo}")
	private String foo;	
	
   @RequestMapping("/show")
   public String show(HttpServletRequest request) {
	   return foo;   
   }
}
