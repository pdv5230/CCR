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
public class Organisation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer oraganisationId;
	
	private String organisationAddress;
	
	private String organisationTan;
	
	private LocalDateTime createdAt;
	
	@PrePersist
	public void prePersist() {
		createdAt = LocalDateTime.now();
		System.out.println(createdAt);
		
	}

}
