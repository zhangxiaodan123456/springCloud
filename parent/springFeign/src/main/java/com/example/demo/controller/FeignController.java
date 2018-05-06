package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.HelloService;

@RestController
@RequestMapping("/fig")
public class FeignController {
  @Autowired
  private HelloService helloServicse;
	
  @RequestMapping(value="/get",method=RequestMethod.GET)
  public String get() {
	  System.out.println("feign====");
	  return helloServicse.getName();
  }
}
