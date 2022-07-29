package com.pru.test.onboarding.task.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pru.test.onboarding.task.entity.Summary;

@Repository
public interface SummaryRepo extends JpaRepository<Summary, Long> {

}
