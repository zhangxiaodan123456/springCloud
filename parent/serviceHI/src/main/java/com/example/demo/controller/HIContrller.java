package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/HI")
public class HIContrller {
  @RequestMapping(value="/get",method=RequestMethod.GET)
  public String get(HttpServletRequest request) {
	  System.out.println(request.getLocalPort());
	  return "进啊的=="+request.getLocalPort();
  }
}
