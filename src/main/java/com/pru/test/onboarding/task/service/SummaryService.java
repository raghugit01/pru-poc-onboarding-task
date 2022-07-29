package com.pru.test.onboarding.task.service;

import java.util.List;

import com.pru.test.onboarding.task.entity.Summary;

public interface SummaryService {
	
	public Summary saveSummary(Summary summary);
	
	public List<Summary> saveAllSummary(List<Summary> summaries);
	
	public Summary getSummaryById(Long Id);
	
	public List<Summary> getAllSummary();
	
	public void deleteSummary(Long summaryId);
}
