package com.workincode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndicadorController {
	
	@GetMapping("/saludo")
	public String saludo() {
		return "Saludo";
	}
	

}
