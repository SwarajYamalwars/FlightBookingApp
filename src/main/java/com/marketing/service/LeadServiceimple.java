package com.marketing.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketing.entities.Lead;
import com.marketing.repositories.Repository;
@Service
public class LeadServiceimple implements LeadService {
	@Autowired
	private Repository leadRepo;
	
	@Override
	public void saveLead(Lead lead) {
leadRepo.save(lead);
	}

	@Override
	public List<Lead> getallLeads() {
List<Lead> leads = leadRepo.findAll();

		return leads;
	}

	@Override
	public void DeleteLead(long id) {
		leadRepo.deleteById(id);
	}

	@Override
	public Lead getLeadByid(long id) {
Optional<Lead> findById = leadRepo.findById(id);
     Lead lead = findById.get();
return lead;
	}

}
