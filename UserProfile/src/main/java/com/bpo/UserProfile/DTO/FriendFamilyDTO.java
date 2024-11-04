package com.bpo.UserProfile.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FriendFamilyDTO {
	private long phoneNo;
	private String friendAndFamilyName;
}
