package com.bpo.UserProfile.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.bpo.UserProfile.entity.Customer; 
import com.bpo.UserProfile.DTO.CustomerDTO;
import com.bpo.UserProfile.DTO.FriendFamilyDTO;
import com.bpo.UserProfile.constant.MappUrl;
import com.bpo.UserProfile.entity.CallDetails;
import com.bpo.UserProfile.serviceImpl.AddFriendNoImpl;
import com.bpo.UserProfile.serviceImpl.CutomerServiceImpl;


@RestController
@RequestMapping("/customer")
/*this class handle request
 * and find Customer details based on number
 * */
public class CustomerController {
	@Autowired 
	AddFriendNoImpl addFriendNoImpl;
	@Autowired 
	CutomerServiceImpl cutomerServiceImpl;
	@PostMapping(MappUrl.CUSTOMER_PROFILE_DETAILS)
	public Customer  getCustomerProfile(@RequestParam("phoneNo") Long phoneNO) 
	{
		return cutomerServiceImpl.viewCustomerProfile(phoneNO);
	}
	
	// Save the friend details of a specific customer
	@PostMapping(MappUrl.SAVE_FRIEND_DETAILS)
	public void saveFriend(@RequestBody List<FriendFamilyDTO> friendDTO) {
		addFriendNoImpl.addphoneNo(friendDTO);
	}

}
