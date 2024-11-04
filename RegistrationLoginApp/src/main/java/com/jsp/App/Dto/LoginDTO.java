package com.jsp.App.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@ NoArgsConstructor
/*this class automatically map between LoginDTO and entity, 
 * */
public class LoginDTO {
	private Long phoneNo;
	private String name;
	
	

}
