package com.pru.test.onboarding.task.service;

import java.util.List;

import com.pru.test.onboarding.task.entity.Training;
import com.pru.test.onboarding.task.exception.TrainingNotFoundException;

public interface TrainingService {

	public Training saveTraining(Training training);

	public Training updateTraining(Training training, String trainingId) throws TrainingNotFoundException;

	public Training getTrainingById(String Id) throws TrainingNotFoundException;

	public List<Training> getAllTraining();

	public void deleteTraining(String trainingId);
}