package com.pru.test.onboarding.task.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pru.test.onboarding.task.entity.Summary;
import com.pru.test.onboarding.task.repo.SummaryRepo;
import com.pru.test.onboarding.task.service.SummaryService;

@Service
public class SummaryServiceImpl implements SummaryService {
	
	@Autowired
	private SummaryRepo repo;

	@Override
	public Summary saveSummary(Summary summary) {
		return repo.save(summary);
	}

	@Override
	public List<Summary> saveAllSummary(List<Summary> summaries) {
		return repo.saveAll(summaries);
	}

	@Override
	public Summary getSummaryById(Long Id) {
		return repo.getReferenceById(Id);
	}

	@Override
	public List<Summary> getAllSummary() {
		return repo.findAll();
	}

	@Override
	public void deleteSummary(Long summaryId) {
		repo.deleteById(summaryId);
	}

}
