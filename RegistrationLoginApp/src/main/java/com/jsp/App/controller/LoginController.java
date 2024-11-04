package com.jsp.App.controller;

import java.util.Scanner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.jsp.App.Contant.MappUrl;
import com.jsp.App.Dto.LoginDTO;
import com.jsp.App.entity.Registration;
import com.jsp.App.exception.LoginException;
import com.jsp.App.serviceImpl.LoginImpl;

@RestController
public class LoginController<Customer>{
	@Autowired
	RestTemplate restTemplate;
	@Autowired 
	LoginImpl loginImpl;
	@PostMapping(MappUrl.VAILIDATE_CREDENTIAL)
	/*this ValidateUserDetails validate
	 * user credential
	 * if user credential is Invalid throw Exception
	 * 
	 */
	public void  ValidateUserDetails(@RequestBody LoginDTO loginDTO)
	{
		try
		{
			Registration regis=loginImpl.registraionValidation(loginDTO);
			if(regis==null)throw new LoginException("Your Credential Is Not Vailid");
			if(regis!=null)
			{
				/*Here use RestTemplate connect to EmailSender spring boot application
				 * if user credential valid then send message "Welcome in infytel App"
				 * */
				String url="http://localhost:8097/emailSenderApp/sendLoginConforemail";
				HttpEntity<Registration> requestPartnerShipmentDto = new HttpEntity<>(regis);
				ParameterizedTypeReference<Registration> myBean =new ParameterizedTypeReference<Registration>() {};
				restTemplate.exchange(url, HttpMethod.POST, requestPartnerShipmentDto,myBean);
			}
				
			
		}
		catch(LoginException loginException)
		{
			loginException.printStackTrace();
		}
	}
}
