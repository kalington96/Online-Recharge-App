package com.bpo.emailSenderApp.serviceImpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.bpo.emailSenderApp.JpaRepository.EmailSendJpaRepo;
import com.bpo.emailSenderApp.dto.EmailDTO;
import com.bpo.emailSenderApp.entity.EmailSender;
import com.bpo.emailSenderApp.service.EmailInfo;
import com.jsp.App.entity.Registration;



@Service
public class EmailInfoImpl implements EmailInfo {
	@Autowired
	EmailSendJpaRepo emailSendJpaRepo;
	@Autowired 
	JavaMailSender javaMailSender;
	@Override
	public void sendRegisConfoToEmail(Registration /*EmailDTO */ registration) {
		EmailSender emailSender=new EmailSender();
		SimpleMailMessage simpleMailSender= new SimpleMailMessage();
		emailSender.setName(registration.getName());
		emailSender.setEmail(registration.getEmail());
		emailSender.setDate(new Date());
		emailSendJpaRepo.save(emailSender);
		simpleMailSender.setFrom("shekharshubhendu7@gmail.com");
		simpleMailSender.setTo(registration.getEmail());
		simpleMailSender.setSubject("Hi your Registraion Success");
		simpleMailSender.setText("Welcom in InfytelApp");
		javaMailSender.send(simpleMailSender);
		System.out.println(javaMailSender.toString());
		

		
	}
	@Override
	public void sendLoginConfoToEmail(Registration registration) {
		// TODO Auto-generated method stub
		EmailSender emailSender=new EmailSender();
		SimpleMailMessage simpleMailSender= new SimpleMailMessage();
		emailSender.setName(registration.getName());
		emailSender.setEmail(registration.getEmail());
		emailSender.setDate(new Date());
		emailSendJpaRepo.save(emailSender);
		simpleMailSender.setFrom("shekharshubhendu7@gmail.com");
		simpleMailSender.setTo(registration.getEmail());
		simpleMailSender.setSubject("HI you are in InfytelApp");
		simpleMailSender.setText("Welcom in InfytelApp");
		javaMailSender.send(simpleMailSender);
		System.out.println(javaMailSender.toString());
		
	}

	
}
