package com.pru.test.onboarding.task.entity;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "onboardingchecklists")
public class OnBoardingChecklist {

	@NotNull
	@Id
	private Long checkListId;
	private String questions;
	private String status;
	private String comment;
	private String link;
	private String linkName;

}
