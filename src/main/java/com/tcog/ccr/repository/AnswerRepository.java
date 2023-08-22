package com.tcog.ccr.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcog.ccr.model.Answer;
import com.tcog.ccr.model.Candidate;
import com.tcog.ccr.model.Question;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {



	Answer findByQuestionAndCandidate(Question question, Candidate candidate);

	List<Answer> findByCandidate(Candidate candidate);

}