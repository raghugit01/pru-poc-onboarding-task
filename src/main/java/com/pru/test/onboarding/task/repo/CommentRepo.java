package com.pru.test.onboarding.task.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pru.test.onboarding.task.entity.Comment;

public interface CommentRepo extends JpaRepository<Comment, Long> {

	@Query(value="SELECT * FROM public.tbl_comments where public.tbl_comments.emp_id = ? order by date desc",nativeQuery=true)
	List<Comment> getCommentByEmpId(String empId);

}
