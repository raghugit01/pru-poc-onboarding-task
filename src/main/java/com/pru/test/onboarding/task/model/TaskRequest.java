package com.pru.test.onboarding.task.model;

import java.util.Date;


public class TaskRequest {
	private Long taskId;
	private String taskName;
	private Date startDate;	
	private String status;
	private String check;
	private Date endDate;
	private String employeeId;
	
	public TaskRequest(Long taskId, String taskName, Date startDate, String status, String check, Date endDate,
			String employeeId) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.startDate = startDate;
		this.status = status;
		this.check = check;
		this.endDate = endDate;
		this.employeeId = employeeId;
	}

	public Long getTaskId() {
		return taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCheck() {
		return check;
	}

	public void setCheck(String check) {
		this.check = check;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		return "TaskRequest [taskId=" + taskId + ", taskName=" + taskName + ", startDate=" + startDate + ", status="
				+ status + ", check=" + check + ", endDate=" + endDate + ", employeeId=" + employeeId + "]";
	}
	
	
}
