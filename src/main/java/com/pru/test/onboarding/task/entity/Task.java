package com.pru.test.onboarding.task.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tbl_task_details")
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long taskId;
	private String taskName;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date startDate;	
	private String status;
	private String checkTask;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date endDate;
	private String employeeId;
	
}
