package com.pru.test.onboarding.task.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pru.test.onboarding.task.entity.Recording;

public interface RecordingRepo extends MongoRepository<Recording, String> {

}
