package com.pru.test.onboarding.task.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pru.test.onboarding.task.entity.Training;
import com.pru.test.onboarding.task.exception.TrainingNotFoundException;
import com.pru.test.onboarding.task.repo.TrainingRepo;
import com.pru.test.onboarding.task.service.TrainingService;

@Service
public class TrainingServiceImpl implements TrainingService{
	@Autowired
	private TrainingRepo repo;

	@Override
	public Training saveTraining(Training training) {
		return repo.save(training);
	}

	@Override
	public Training updateTraining(Training training, String trainingId) throws TrainingNotFoundException {
		Training trng = repo.findById(trainingId)
		          .orElseThrow(() -> new TrainingNotFoundException("Training not found"));
		trng.setTrainingName(training.getTrainingName());
		trng.setLink(training.getLink());
		trng.setRemarks(training.getRemarks());
		Training updatedTraining = repo.save(trng);
		return updatedTraining;

	}

	@Override
	public Training getTrainingById(String trainingId) throws TrainingNotFoundException {
		return repo.findById(trainingId)
		          .orElseThrow(() -> new TrainingNotFoundException("Training not found"));
	}

	@Override
	public List<Training> getAllTraining() {
		return repo.findAll();
	}

	@Override
	public void deleteTraining(String trainingId) {
		repo.deleteById(trainingId);
	}
}