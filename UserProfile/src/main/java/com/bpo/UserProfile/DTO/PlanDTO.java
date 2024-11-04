package com.bpo.UserProfile.DTO;

import java.time.LocalDate;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlanDTO {
    private Integer planId;
	private String  planName;
	private Integer nationalRate;
	private Integer localRate;
	///private Date date;

}
