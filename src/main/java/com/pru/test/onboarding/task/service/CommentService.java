package com.pru.test.onboarding.task.service;

import com.pru.test.onboarding.task.entity.Comment;

public interface CommentService {
	
	public Comment getCommentByEmpId(String empId);
	
	public Comment saveOrUpdateCommentByEmpId(Comment comment);

}
