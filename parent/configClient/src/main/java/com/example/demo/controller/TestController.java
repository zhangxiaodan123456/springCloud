package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

	@Value("${abc}")
	private String foo;

	@RequestMapping("/show")
	public String show() {
		return foo;
	}
}
