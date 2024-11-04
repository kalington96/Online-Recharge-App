package com.bpo.UserProfile.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bpo.UserProfile.entity.Plan;

public interface PlanRepository  extends JpaRepository<Plan,Integer>{

}
