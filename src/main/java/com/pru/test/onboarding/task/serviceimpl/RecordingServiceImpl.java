package com.pru.test.onboarding.task.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pru.test.onboarding.task.entity.Recording;
import com.pru.test.onboarding.task.service.RecordingService;
import com.pru.test.onboarding.task.repo.RecordingRepo;

@Service
public class RecordingServiceImpl implements RecordingService {

	@Autowired
	private RecordingRepo recordingRepo;

	@Override
	public List<Recording> getAllRecording() {
		return recordingRepo.findAll();
	}

	@Override
	public Recording insertRecording(Recording recording) {
		return recordingRepo.save(recording);
	}

}
