package com.tcog.ccr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcog.ccr.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
	

}
