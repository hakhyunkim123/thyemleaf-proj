package com.webproj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.webproj.dto.ReportDto;

@Controller
public class WebController {
	
	@GetMapping("/test")
	public String getUser(Model model) {
		ReportDto report = new ReportDto("API", "Vendor", "IOG", 1, 0, 1);
		
		model.addAttribute("report", report);
		
		return "/test";
	}
}
