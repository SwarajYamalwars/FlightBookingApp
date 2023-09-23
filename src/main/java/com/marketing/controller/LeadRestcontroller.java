package com.marketing.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marketing.entities.Lead;
import com.marketing.repositories.Repository;

@RestController
@RequestMapping("/api/Leads")
public class LeadRestcontroller {
@Autowired
	private Repository leadRepo;
	
@GetMapping
	public List<Lead> getAllLeads() {
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}
@PostMapping
public void saveLead (@RequestBody Lead leads) {
	leadRepo.save(leads);
}
@PutMapping
public void updateLead(@RequestBody Lead leads) {
	leadRepo.save(leads);
}
@DeleteMapping("/delete/{id}")
public void deleteLead(@PathVariable("id")long id) {
	leadRepo.deleteById(id);
}
@GetMapping("/find/{id}")
public Lead getLead(@PathVariable("id") long id) {
Optional<Lead> findById = leadRepo.findById(id);	
Lead lead = findById.get();
return lead;
}
}
