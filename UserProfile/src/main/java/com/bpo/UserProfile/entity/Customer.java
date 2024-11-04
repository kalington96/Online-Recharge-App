package com.bpo.UserProfile.entity;

import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="Customer_Table")
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	@Id
	@Column(name = "phone_no", nullable = false)
	private Long phoneNo;
	@Column(name="name",nullable = false, length = 50)
	private String name;
	@Column(name="age",nullable = false)
	private Integer age;
	@Column(nullable = false, length = 50)
	private String address;
	@Column(nullable = false, length = 1)
	private char gender;
	@OneToMany(cascade=CascadeType.MERGE)
	@JoinColumn(foreignKey = @ForeignKey(name ="number"))
	private List<FriendFamilys> friendFamilys=new ArrayList<>();
	@OneToMany(cascade=CascadeType.MERGE)
	@JoinColumn(foreignKey = @ForeignKey(name ="plan_id"))
	private List<Plan> plan =new ArrayList<>();

}
