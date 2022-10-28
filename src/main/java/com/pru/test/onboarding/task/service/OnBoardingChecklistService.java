package com.pru.test.onboarding.task.service;

import java.util.List;
import com.pru.test.onboarding.task.entity.OnBoardingChecklist;

public interface OnBoardingChecklistService {
	
	public OnBoardingChecklist saveOnBoardingChecklist(OnBoardingChecklist boardingChecklist);
	
	public List<OnBoardingChecklist> saveAllOnBoardingChecklist(List<OnBoardingChecklist> boardingChecklists);
	
	public OnBoardingChecklist getOnBoardingChecklistById(String Id);
	
	public List<OnBoardingChecklist> getAllOnBoardingChecklist();
	
	public void deleteOnBoardingChecklist(String OnBoardingChecklistId);

}
