package com.tcog.ccr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcog.ccr.model.Users;

public interface UserRepository extends JpaRepository<Users, Integer>{

}
