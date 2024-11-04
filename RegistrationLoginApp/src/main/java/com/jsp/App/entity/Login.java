package com.jsp.App.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
/*this Login class represents a table in a relational database
 * */
public class Login {
	@Id
	@Column(name="phone_No",nullable=false)
	private Long phoneNo;
	@Column(name="user_name",nullable=false)
	private String username;
	@Column(name="Date",nullable=false)
	private Date date;

}
