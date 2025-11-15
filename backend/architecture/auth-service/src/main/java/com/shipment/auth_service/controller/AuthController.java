package com.shipment.auth_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Resource;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {
	
	@GetMapping("/login")
	public String login() {
		return "Done";
	}

}
