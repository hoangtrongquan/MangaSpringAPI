package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test2 {
	@GetMapping("/home")
	public String home () {
		return "123";
	}
}
