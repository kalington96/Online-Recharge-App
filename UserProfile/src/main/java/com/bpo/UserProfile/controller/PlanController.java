package com.bpo.UserProfile.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bpo.UserProfile.DTO.PlanDTO;
import com.bpo.UserProfile.serviceImpl.PlanServiceImpl;

@RestController
@RequestMapping("/plan")
/*this class handle request
 * and find user plan details 
 * */
public class PlanController {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PlanServiceImpl planServiceImpl;
	@PostMapping(value = "/plans")
	public void saveAllPlans(@RequestBody List<PlanDTO> plandto) {
		planServiceImpl.saveAllPlans(plandto);
	}
}
