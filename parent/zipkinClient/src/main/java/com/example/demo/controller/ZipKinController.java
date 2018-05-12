package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/zip")
public class ZipKinController {
  @Bean
  public RestTemplate restTemplate() {
	  return new RestTemplate();
  }
  
  @Autowired
  private RestTemplate restTemplate;
  
  
  @RequestMapping("/hi")
  public String hi() {
	 return restTemplate.getForObject("http://localhost:8084/zip1/miya", String.class);
  }
  
  @RequestMapping("/info")
  public String info() {
	 return "dsjflskdjflkds";
  }
	
	
}
