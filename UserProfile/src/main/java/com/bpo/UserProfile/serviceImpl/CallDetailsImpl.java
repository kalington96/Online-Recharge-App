package com.bpo.UserProfile.serviceImpl;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bpo.UserProfile.repository.CallDetailsRepository;
import com.bpo.UserProfile.service.CallDetail;
import com.bpo.UserProfile.DTO.CallDetailsDTO;
import com.bpo.UserProfile.entity.CallDetails;

@Service
public class CallDetailsImpl implements CallDetail {

	@Autowired
	CallDetailsRepository callDetailsRepository;
	@Override
	public List<CallDetails> findCallDetails(Long phoneNo) {
		List<CallDetails> lst=callDetailsRepository.findByCalledBy(phoneNo);
		return lst;
	}
	@Override
	public void saveCallDetails(List<CallDetailsDTO> calldetails){
		List<CallDetails> lst=new ArrayList<CallDetails>();
		for(CallDetailsDTO calldetal:calldetails)
		{
			CallDetails callDet=new CallDetails();
			callDet.setCalledBy(calldetal.getCalledBy());
			callDet.setCalledTo(calldetal.getCalledTo());
			callDet.setCalledOn(LocalDate.parse(calldetal.getDate()));
			callDet.setDuration(calldetal.getDuration());
			
			lst.add(callDet);
		}
		callDetailsRepository.saveAll(lst);
		
	}

	
}
