package com.pru.test.onboarding.task.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pru.test.onboarding.task.entity.Task;
import com.pru.test.onboarding.task.service.TaskService;

@RestController
@RequestMapping("/task")
public class UserTaskController {
	
	@Autowired
	private TaskService service;
	
	private Logger logger = LoggerFactory.getLogger("UserTaskController");
	
	@PostMapping("/add-task")
	public Task addTask(@RequestBody Task task) {
		Task tsk = service.saveTask(task);
		logger.info("Task has been added  "+tsk);
		return tsk;
	}
	
	@GetMapping("/get-all-task")
	public List<Task> getAllTasks(){
		List<Task> tasks = service.getAllTasks();
		return tasks;
	}

}
