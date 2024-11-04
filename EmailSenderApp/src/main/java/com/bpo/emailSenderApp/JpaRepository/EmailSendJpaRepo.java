package com.bpo.emailSenderApp.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bpo.emailSenderApp.entity.EmailSender;

public interface  EmailSendJpaRepo extends JpaRepository<EmailSender,String>{

}
