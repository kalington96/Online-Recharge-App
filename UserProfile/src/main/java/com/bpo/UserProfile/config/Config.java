package com.bpo.UserProfile.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages="com.bpo.UserProfile")
public class Config {
	@Bean()
	public HikariDataSource getConnection()
	{
		HikariDataSource hikariDataSource=new HikariDataSource();
		hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/IntfytelLogin");
		hikariDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		hikariDataSource.setUsername("root");
		hikariDataSource.setPassword("Kalington@95");
		return hikariDataSource;
		
		
		
	}
	@Bean()
	public RestTemplate restTemplate()
	{
		return new RestTemplate(); 
	}
}