package com.tcog.ccr.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import lombok.Data;

@Data
@Entity
public class HRAdmin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer hradminId;

	private Integer userId;

	private Integer organisationId;

	private LocalDateTime createdAt;
	
	@PrePersist
	public void prePersist() {
		createdAt = LocalDateTime.now();
		System.out.println(createdAt);
	}

}
