package com.pru.test.onboarding.task.service;

import java.util.List;

import com.pru.test.onboarding.task.entity.Recording;

public interface RecordingService {
	
	public List<Recording> getAllRecording();
	
	public Recording insertRecording(Recording recording);

}
