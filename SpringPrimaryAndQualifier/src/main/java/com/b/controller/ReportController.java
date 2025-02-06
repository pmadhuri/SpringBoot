package com.b.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.b.service.ReportServiceI;

@Controller
public class ReportController {
	@Autowired
	private ReportServiceI reportServiceI;
	public String generateReport () {
		String report=reportServiceI.generateReport();
		return report;
		
		
	}
	
	

}
