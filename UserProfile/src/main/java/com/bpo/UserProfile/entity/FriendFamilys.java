package com.bpo.UserProfile.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="ADD_NUMBER")
@AllArgsConstructor
@NoArgsConstructor
public class FriendFamilys {
	@Id
	@Column(name = "number",nullable = false)
	private long addNumber;
	@Column(name = "person_name",nullable = false)
	private String name;


}
