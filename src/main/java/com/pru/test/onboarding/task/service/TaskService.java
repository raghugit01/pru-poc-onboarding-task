package com.pru.test.onboarding.task.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.pru.test.onboarding.task.entity.Task;
@Component
public interface TaskService {
	
	public Task saveTask(Task task);
	
	public List<Task> saveAllTask(List<Task> tasks);
	
	public Task getTaskById(Long Id);
	
	public List<Task> getAllTasks();
	
	public void delete(Long taskId);

}
