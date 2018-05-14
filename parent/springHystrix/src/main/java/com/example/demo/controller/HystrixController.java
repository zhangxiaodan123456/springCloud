package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/hystrix")
public class HystrixController {
	
  @Value("${server.port}")	
  String foo;
	
  @RequestMapping(value="/get",method=RequestMethod.GET)
  @HystrixCommand(fallbackMethod="hierror")
  public String get() {
	 return foo;
  }
  
  public String hierror() {
	  return "i am sorry";
  }
  
  
}
