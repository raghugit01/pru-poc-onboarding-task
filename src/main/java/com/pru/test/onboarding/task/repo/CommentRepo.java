package com.pru.test.onboarding.task.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pru.test.onboarding.task.entity.Comment;

public interface CommentRepo extends JpaRepository<Comment, String> {

}
