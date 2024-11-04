package com.bpo.emailSenderApp.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Email_Send")
@Data
public class EmailSender {
	@Id
	@Column(name="email_id",nullable=false)
	private String email;
	@Column(name="name",nullable=false)
	private String name;
	@Column(name="date",nullable=false)
	private Date date;
	

}
