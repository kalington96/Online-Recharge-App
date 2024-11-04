package com.jsp.App.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.App.Contant.MappUrl;
import com.jsp.App.Dto.RegisterDTO;
import com.jsp.App.entity.Registration;
import com.jsp.App.serviceImpl.FindRegisDetailsServiceImpl;
import com.jsp.App.serviceImpl.RegisterSeviceImpl;

@RestController
public class RegistrationController {
	@Autowired
	RegisterSeviceImpl registerSeviceImpl;
	@Autowired
	FindRegisDetailsServiceImpl findRegisDetailsServiceImpl;
	@PostMapping(MappUrl.SAVE_DETAILS)
	/*Save user details
	 * Here use correct formate Mobile no
	 * */
	public void saveUserDetails(@RequestBody RegisterDTO registerDTO)
	{
		registerSeviceImpl.saveUserDetails(registerDTO);
	}
	@PostMapping(MappUrl.GET_DETAILS)
	/*this method user for get User details
	 * for Testing Purpose 
	 * */
	public @ResponseBody Registration getUserRestDetails(@RequestParam("phoneNo") Long phoneNo)
	{
		///System.out.println(phoneNo);
		return  findRegisDetailsServiceImpl.findRegistDetails(phoneNo);
		
	}

}
