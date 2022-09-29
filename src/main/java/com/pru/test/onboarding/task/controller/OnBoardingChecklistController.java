package com.pru.test.onboarding.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pru.test.onboarding.task.entity.OnBoardingChecklist;
import com.pru.test.onboarding.task.service.OnBoardingChecklistService;


@RestController
@RequestMapping("/onboarding_checklist")
public class OnBoardingChecklistController {
	@Autowired
	private OnBoardingChecklistService service;
	
	
	@PreAuthorize("hasAnyRole({'ROLE_ONBOARDING_REVIEWER','ROLE_ONBOARDING_MANAGER'})")
	@PostMapping(path = "/add-onboarding-checklist",consumes = "application/json")
	public OnBoardingChecklist addOnBoarding(@RequestBody OnBoardingChecklist checklist) {
		OnBoardingChecklist boardingChecklist  = service.saveOnBoardingChecklist(checklist);
		return boardingChecklist;
	}
	
	@PostMapping("/add-all-onboarding-checklist")
	@PreAuthorize("hasAnyRole({'ROLE_ONBOARDING_REVIEWER','ROLE_ONBOARDING_MANAGER'})")
	public List<OnBoardingChecklist> addAllOnBoarding(@RequestBody List<OnBoardingChecklist> checklists){
		return service.saveAllOnBoardingChecklist(checklists);
	}
		
	@PreAuthorize("hasAnyRole({'ROLE_ASSOCIATE','ROLE_ONBOARDING_REVIEWER','ROLE_ONBOARDING_MANAGER'})")
	@GetMapping("/get-all-onboarding-checklist")
	public List<OnBoardingChecklist> getAllOnBoarding(){
		List<OnBoardingChecklist> boardingChecklists= service.getAllOnBoardingChecklist();
		return boardingChecklists;
	}
	
	
	@PreAuthorize("hasAnyRole({'ROLE_ONBOARDING_REVIEWER','ROLE_ONBOARDING_MANAGER'})")
	@GetMapping("/{id}")
	public OnBoardingChecklist getOnBoardingById(@PathVariable(name = "id") Long id) {
		OnBoardingChecklist boardingChecklist=null;
		boardingChecklist=service.getOnBoardingChecklistById(id);
		return boardingChecklist;
	}
	
	@DeleteMapping("/{id}")
	@PreAuthorize("hasRole('ROLE_ONBOARDING_MANAGER')")
	public String deleteOnBoarding(@PathVariable(name = "id") Long id) {
		service.deleteOnBoardingChecklist(id);
		return "Task "+id+" has been deleted.";
	}
}
