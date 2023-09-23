package com.marketing.service;

import java.util.List;

import com.marketing.entities.Lead;

public interface LeadService {
	
	public void saveLead(Lead lead);

	public List<Lead> getallLeads();

	public void DeleteLead(long id);

	public Lead getLeadByid(long id);

}
