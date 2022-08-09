package com.pru.test.onboarding.task.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pru.test.onboarding.task.entity.Comment;
import com.pru.test.onboarding.task.repo.CommentRepo;
import com.pru.test.onboarding.task.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {
	
	@Autowired
	private CommentRepo commentRepo;

	@Override
	public Comment getCommentByEmpId(String empId) {
		if(commentRepo.findById(empId).isPresent())
			return commentRepo.getReferenceById(empId);
		else
			return null;
	}

	@Override
	public Comment saveOrUpdateCommentByEmpId(Comment comment) {
		return commentRepo.save(comment);

	}

}
