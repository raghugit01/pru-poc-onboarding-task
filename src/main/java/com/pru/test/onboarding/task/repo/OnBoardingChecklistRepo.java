package com.pru.test.onboarding.task.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pru.test.onboarding.task.entity.OnBoardingChecklist;

@Repository
public interface OnBoardingChecklistRepo extends JpaRepository<OnBoardingChecklist, Long> {

}
