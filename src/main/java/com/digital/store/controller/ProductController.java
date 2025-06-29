package com.digital.store.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@GetMapping("/Diksha")
	public String product() {
		return "Diksha is Beautiful.";
	}
}
