package com.digital.store.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DigistoreController {

	@GetMapping("/PhotoUpload")
	public String digistore() {
		return "PhotoUpload";
	}
}
