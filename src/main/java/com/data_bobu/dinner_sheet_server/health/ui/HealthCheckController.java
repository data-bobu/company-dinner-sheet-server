package com.data_bobu.dinner_sheet_server.health.ui;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthCheckController {

	@GetMapping
	public String healthCheck() {
		return "ok";
	}
}