package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rib")
public class RibbonController {
  @Autowired
  private RestTemplate restTemplate;
	
  @RequestMapping(value="/get",method=RequestMethod.GET)
  public String get() {
	  String str=restTemplate.getForObject("http://serviceHI/HI/get", String.class);
	  System.out.println("ribbon===="); 
	  return str;
  }
  
  
}
