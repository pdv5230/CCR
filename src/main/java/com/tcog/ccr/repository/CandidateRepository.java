package com.tcog.ccr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcog.ccr.model.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate, Integer> {

}
