package com.pru.test.onboarding.task.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pru.test.onboarding.task.entity.OnBoardingChecklist;
import com.pru.test.onboarding.task.repo.OnBoardingChecklistRepo;
import com.pru.test.onboarding.task.service.OnBoardingChecklistService;

@Service
public class OnBoardingChecklistServiceImpl implements OnBoardingChecklistService {
	
	@Autowired
	private OnBoardingChecklistRepo checklistRepo;

	@Override
	public OnBoardingChecklist saveOnBoardingChecklist(OnBoardingChecklist boardingChecklist) {
		return checklistRepo.save(boardingChecklist);
	}

	@Override
	public List<OnBoardingChecklist> saveAllOnBoardingChecklist(List<OnBoardingChecklist> boardingChecklists) {
		return checklistRepo.saveAll(boardingChecklists);
	}

	@Override
	public OnBoardingChecklist getOnBoardingChecklistById(Long Id) {
		Optional<OnBoardingChecklist> on=checklistRepo.findById(Id);
		return on.get();
	}

	@Override
	public List<OnBoardingChecklist> getAllOnBoardingChecklist() {
		return checklistRepo.findAll();
	}

	@Override
	public void deleteOnBoardingChecklist(Long OnBoardingChecklistId) {
		checklistRepo.deleteById(OnBoardingChecklistId);
	}

}
