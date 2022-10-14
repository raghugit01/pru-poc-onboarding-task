package com.pru.test.onboarding.task.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pru.test.onboarding.task.entity.Training;

@Repository
public interface TrainingRepo extends JpaRepository<Training, Integer> {

}
