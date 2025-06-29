package com.digital.store.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DigistoreController {

	@GetMapping("/Pranik")
	public String digistore() {
		return "Pranik is Handsome.";
	}
}
