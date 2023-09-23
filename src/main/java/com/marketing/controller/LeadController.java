package com.marketing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketing.entities.Lead;
import com.marketing.service.LeadService;
import com.marketing.util.EmailService;
@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadServ;
	//http://localhost:8080/create
	@Autowired
	private EmailService emailService;

	@RequestMapping("/create")
	public String createform() {
		return"createlead";
	}
	@RequestMapping("/saveLead")
	public String saveLead(Lead lead,ModelMap model) {
		model.addAttribute("mdg", "data saved");
		emailService.sendEmail(lead.getEmail(), "welcome Email", "test");
		leadServ .saveLead(lead);
		return"createlead";
	}
	//http://localhost:8080/listall
	@RequestMapping("listall")
	public String listlead(Model model) {
		List<Lead> leads = leadServ.getallLeads();
		model.addAttribute("leads", leads);
		return"list_leads";
	}
	@RequestMapping("/delete")
	public String DeleteLead(@RequestParam("id")long id,Model model) {
		leadServ.DeleteLead(id);
		
		List<Lead> leads = leadServ.getallLeads();
		model.addAttribute("leads", leads);
		return"list_leads";
	}
	@RequestMapping("/update")
	public String UpdateLead(@RequestParam("id")long id,Model model) {
Lead lead = leadServ.getLeadByid(id);
model.addAttribute("lead", lead);
		return"updatelead";
		
		
	}
	
	
	@RequestMapping("/updates")
	public String updates(Lead lead,ModelMap model) {
		leadServ.saveLead(lead);
		
		List<Lead> leads = leadServ.getallLeads();
		model.addAttribute("leads", leads);
		return"list_leads";
	}
	}
	
	

