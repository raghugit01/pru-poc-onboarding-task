package com.pru.test.onboarding.task.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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

	@NotNull
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long taskId;
	@NotBlank(message = "task name cant be empty")
	private String taskName;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date startDate;
	private String status;
	private String checkTask;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date endDate;
	private String employeeId;

}
