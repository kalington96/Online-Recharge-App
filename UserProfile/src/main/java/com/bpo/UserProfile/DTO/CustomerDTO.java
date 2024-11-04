package com.bpo.UserProfile.DTO;

import java.util.ArrayList;
import java.util.List;

import com.bpo.UserProfile.entity.FriendFamilys;
import com.bpo.UserProfile.entity.Plan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {
	
	 long phoneNo;
	 String name;
	 int age;
	 char gender;
	 List<FriendFamilys> friendFamilys=new ArrayList<>();
	 List<Plan> paln=new ArrayList<>();
	

}
