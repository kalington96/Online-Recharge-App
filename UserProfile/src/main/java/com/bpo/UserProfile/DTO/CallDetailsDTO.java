package com.bpo.UserProfile.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CallDetailsDTO {
	private long calledBy;
	private long calledTo;
	private String date;
	private String duration;

}
