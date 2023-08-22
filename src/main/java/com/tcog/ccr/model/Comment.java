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
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer commentId;
	
	private String comment;
	
	private String suggestion;
	
	private Boolean commentApprove;
	
	@ManyToOne
	@JoinColumn(name="candidateId")
	private Candidate candidate;
	
	@ManyToOne
	@JoinColumn(name="hrId")
	private HRAdmin hra;
	
}
