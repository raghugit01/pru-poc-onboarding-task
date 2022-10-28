package com.pru.test.onboarding.task.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pru.test.onboarding.task.entity.OnBoardingChecklist;

@Repository
public interface OnBoardingChecklistRepo extends MongoRepository<OnBoardingChecklist, String> {

}
