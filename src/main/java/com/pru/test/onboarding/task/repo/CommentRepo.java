package com.pru.test.onboarding.task.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pru.test.onboarding.task.entity.Comment;

public interface CommentRepo extends MongoRepository<Comment, Long> {

	List<Comment> findByEmpIdOrderByDateDesc(String empId);

}
