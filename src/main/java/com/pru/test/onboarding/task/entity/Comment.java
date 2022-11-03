package com.pru.test.onboarding.task.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "comment")
public class Comment {

	@Id
	private String commentId;
	private String empId;
	private String comments;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date date;
	private String who;
	private String role;
	
}
