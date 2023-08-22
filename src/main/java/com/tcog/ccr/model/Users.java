package com.tcog.ccr.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	
	private String name;
	
	private String password;
	
	private String email;
	
	private Integer roleId;
	
	private LocalDateTime createdAt;
	
	public void prePersist() {
		createdAt = LocalDateTime.now();
		System.out.println(createdAt);
	}
		
	
	

}
