package com.pru.test.onboarding.task.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pru.test.onboarding.task.entity.Task;
@Repository
public interface TaskRepo extends MongoRepository<Task, Long> {

}
