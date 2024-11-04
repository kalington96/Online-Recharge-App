package com.bpo.UserProfile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bpo.UserProfile.DTO.CallDetailsDTO;
import com.bpo.UserProfile.entity.CallDetails;
import com.bpo.UserProfile.serviceImpl.CallDetailsImpl;

@RestController
@RequestMapping("/callDetails")
/*this class handle request
 * and find call details based on number
 * */
public class CallDetailsController {
	@Autowired
	CallDetailsImpl callDetailsImpl;
	@PostMapping("/findAllCallDetails/{number}")
	public @ResponseBody List<CallDetails> findAllCallDetails(@PathVariable("number")long number)
	{
		return callDetailsImpl.findCallDetails(number); 
		
	}
	@PostMapping("/saveCalldetails")
	public void saveAllCallDetails(@RequestBody List<CallDetailsDTO> calldetails)
	{
		callDetailsImpl.saveCallDetails(calldetails);
		System.out.println(calldetails);
		
	}

}
