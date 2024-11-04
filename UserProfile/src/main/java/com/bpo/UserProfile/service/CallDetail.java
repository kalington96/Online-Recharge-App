package com.bpo.UserProfile.service;

import java.util.List;

import com.bpo.UserProfile.DTO.CallDetailsDTO;
import com.bpo.UserProfile.entity.CallDetails;

public interface CallDetail {
	public List<CallDetails> findCallDetails(Long phoneNo);
	public void saveCallDetails(List<CallDetailsDTO> calldetails);

}
