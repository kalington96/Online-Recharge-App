package com.bpo.UserProfile.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.bpo.UserProfile.DTO.CustomerDTO;
import com.bpo.UserProfile.entity.CallDetails;
import com.bpo.UserProfile.entity.Customer;
import com.bpo.UserProfile.entity.FriendFamilys;
///import com.bpo.UserProfile.entity.Customer;
import com.bpo.UserProfile.entity.Plan;

public interface CutomerService {
	public Customer  viewCustomerProfile(Long phoneNO);
	//public CallDetails getCallDetails(Long phoneNo);
	public  List<FriendFamilys> saveFamilyAndFriendDetails();
	public List<Plan> plan();

}
