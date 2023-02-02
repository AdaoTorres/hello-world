package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
class HelloWorldController {
	
	@GetMapping
	public String HelloWorld() {
		return "Hello World!!!";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
	return ("Bsm's da Generation Brasil!");
}
	
	@GetMapping("/obj")
	public String obj() {
	return ("Objetivo de aprendizagem da semana...");
	}

}
