package com.pru.test.onboarding.task.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tbl_onBoarding_checklist")
public class OnBoardingChecklist {

	@NotNull
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long checkListId;
	private String uestions;
	private String status;
	private String comment;
	
}
