package com.pru.test.onboarding.task.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pru.test.onboarding.task.entity.Task;
import com.pru.test.onboarding.task.repo.TaskRepo;
import com.pru.test.onboarding.task.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService {
	
	@Autowired
	private TaskRepo taskRepo;

	@Override
	public Task saveTask(Task task) {
		task = taskRepo.save(task);
		return task;
	}

	@Override
	public List<Task> saveAllTask(List<Task> tasks) {
		tasks = taskRepo.saveAll(tasks);
		return tasks;
	}

	@Override
	public Task getTaskById(Long Id) {
		Task task = taskRepo.getReferenceById(Id);
		return task;
	}

	@Override
	public List<Task> getAllTasks() {
		List<Task> tasks = taskRepo.findAll();
		return tasks;
	}

	@Override
	public void delete(Long taskId) {
		taskRepo.deleteById(taskId);
	}

}
