package com.pru.test.onboarding.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pru.test.onboarding.task.entity.Recording;
import com.pru.test.onboarding.task.service.RecordingService;

@CrossOrigin
@RestController
@RequestMapping("/recording")
public class RecordingsController {
	
	@Autowired
	private RecordingService recordingService;
	
	@PreAuthorize("hasAnyRole({'ROLE_ASSOCIATE','ROLE_ONBOARDING_REVIEWER','ROLE_ONBOARDING_MANAGER'})")
	@GetMapping("/get-all-recordings")
	public List<Recording> getAllRecording(){
		List<Recording> recording= recordingService.getAllRecording();
		return recording;
	}
	
	@PreAuthorize("hasAnyRole({'ROLE_ONBOARDING_REVIEWER','ROLE_ONBOARDING_MANAGER'})")
	@PostMapping("/add-recording")
	public Recording saveOrUpdateCommentByID(@RequestBody Recording newRecording){
		Recording recording= recordingService.insertRecording(newRecording);
		return recording;
	}

}
