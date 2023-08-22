package com.tcog.ccr.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Answer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer answerId;

	private boolean getAnswer;

	@ManyToOne
	@JoinColumn(name = "candidateId")
	private Candidate candidate;

	@ManyToOne
	@JoinColumn(name = "questionId")
	private Question question;
}