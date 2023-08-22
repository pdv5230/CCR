package com.tcog.ccr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcog.ccr.model.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer>{

}
