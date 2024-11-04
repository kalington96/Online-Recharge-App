package com.jsp.App.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
/*this class automatically map between LoginDTO and entity, 
 * */
public class RegisterDTO {
	private Long phoneNo;
	private String name;
	private int age;
	private char gender;
	private String email;
	private String address;

}
