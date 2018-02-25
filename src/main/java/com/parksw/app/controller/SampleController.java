package com.parksw.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.parksw.app.service.SampleService;

@Controller
public class SampleController {

	@Autowired
	private SampleService sampleService;
	
	@GetMapping("")
	public String samples(Model model) {
		model.addAttribute("samples", sampleService.getSamples());
		
		return "samples";
	}
}
