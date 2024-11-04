package com.bpo.emailSenderApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bpo.emailSenderApp.constant.MappUrl;
import com.bpo.emailSenderApp.dto.EmailDTO;
//import com.bpo.emailSenderApp.repository.EmailRepository;
import com.bpo.emailSenderApp.serviceImpl.EmailInfoImpl;
import com.jsp.App.entity.Registration;

@RestController
public class EmailController {

	@Autowired
	EmailInfoImpl emailInfoImpl;
	@PostMapping(MappUrl.SEND_REGISTR_CONFORM_TO_EMAIL)
	public void sendMailForRegis(@RequestBody Registration  registration /*@RequestBody  EmailDTO registration*/)
	{
		emailInfoImpl.sendRegisConfoToEmail(registration);
		System.out.println("-------------------");
	}
	@PostMapping(MappUrl.SEND_LOGIN_TO_EMAIL)
	public void sendMailForLogin(@RequestBody Registration  registration /*@RequestBody  EmailDTO registration*/)
	{
		emailInfoImpl.sendLoginConfoToEmail(registration);
		System.out.println("-------------------");
	}

}
