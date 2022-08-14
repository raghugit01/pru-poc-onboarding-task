package com.pru.test.onboarding.task.service;

import java.util.List;

import com.pru.test.onboarding.task.entity.Comment;

public interface CommentService {
	
	public List<Comment> getCommentByEmpId(String empId);
	
	public Comment insertComment(Comment comment);

}
