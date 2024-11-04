package com.bpo.UserProfile.serviceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.bpo.UserProfile.DTO.CustomerDTO;
import com.bpo.UserProfile.entity.CallDetails;
import com.bpo.UserProfile.entity.Customer;
import com.bpo.UserProfile.entity.FriendFamilys;
import com.bpo.UserProfile.entity.Plan;
import com.bpo.UserProfile.repository.AddFrindNoRepository;
import com.bpo.UserProfile.repository.CustomerRepository;
import com.bpo.UserProfile.repository.PlanRepository;
import com.bpo.UserProfile.service.CutomerService;
import com.jsp.App.entity.Registration;

@Service
public class CutomerServiceImpl implements CutomerService{
	@Autowired
	RestTemplate  restTemplate;
	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	AddFrindNoRepository addFrindNoRepository;
	@Autowired
	PlanRepository planRepository;
	@Override
	/*public void viewCustomerProfile(CustomerDTO cus) */
	//public Customer viewCustomerProfile(Long phoneNo,@RequestBody CustomerDTO cus)
	public Customer viewCustomerProfile(Long phoneNo)
	{
		///System.out.println("------------------------"+phoneNo);
		Registration registr=getRegistDetails(phoneNo);
		if(registr!=null)
		{
			Customer customer=new Customer();
			customer.setAddress(registr.getAddress());
			customer.setName( registr.getName());
			customer.setAge(registr.getAge());
			customer.setGender(registr.getGender());
			customer.setPhoneNo(registr.getPhoneNo());
			//customer.setPlan(cus.getPaln());
			///customer.setFriendFamilys(cus.getFriendFamilys());
			customer.setPlan(plan());
			customer.setFriendFamilys(saveFamilyAndFriendDetails());
			customerRepository.save(customer);
			return customer;
		}
		return null;
	}
	@Override
	public List<FriendFamilys> saveFamilyAndFriendDetails() {
		return addFrindNoRepository.findAll();
		
	}
	public Registration getRegistDetails(Long phoneNo)
	{
		String url="http://localhost:8090/AppTest/getRegist/{phoneNo}?phoneNo="+phoneNo+"";
		HttpEntity requestPartnerShipmentDto = new HttpEntity(new Registration());
		ResponseEntity<Registration>partnerShipmentDto = restTemplate.exchange(url, HttpMethod.POST, requestPartnerShipmentDto,Registration.class,phoneNo);
		return  partnerShipmentDto .getBody();
		
	}

	@Override
	public List<Plan> plan() {
		return planRepository.findAll();
	}

}
