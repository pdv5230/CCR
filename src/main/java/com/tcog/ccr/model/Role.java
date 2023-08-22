package com.tcog.ccr.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import lombok.Data;

@Data
@Entity
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer roleId;
	
	
	private String roleName;
	
	private LocalDateTime createdAt;
	
	@PrePersist
	public void perPersist() {
		createdAt = LocalDateTime.now();
		System.out.println(createdAt);
	}

}
