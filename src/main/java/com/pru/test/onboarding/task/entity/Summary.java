package com.pru.test.onboarding.task.entity;

import java.util.Date;

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
@Table(name = "tbl_summary_details")
public class Summary {
	@NotNull
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long summaryId;
	private Float version;
	private Date versionDate;
	private String author;
	private String natureOfChange;
}
