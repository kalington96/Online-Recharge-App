package com.jsp.App.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Registration_Details")
/*this Login class represents a table in a relational database
 * */
public class Registration {
	@Id
	@Column(name="phone_No",nullable=false)
	private Long phoneNo;
	@Column(name="name",nullable=false)
	private String name;
	@Column(name="age",nullable=false)
	private int age;
	@Column(name="gender",nullable=false)
	private char gender;
	@Column(name="email",nullable=false)
	private String email;
	@Column(name="address",nullable=false)
	private String address;
	@Column(name="Date",nullable=false)
	private Date date;

}
