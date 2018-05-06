package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class TestController {
	    @RequestMapping("/test")
	    public String test(HttpServletRequest request,HttpServletResponse response) {
	    	String aplIdd=request.getParameter("aplIdd");
	    	System.out.println("1123");
	    	return "866665";
	    }
}
