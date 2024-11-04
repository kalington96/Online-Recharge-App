package com.bpo.UserProfile.entity;

import java.time.LocalDate;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "calldetails")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CallDetails {
	@Id
	@Column(name="calledOn",nullable = false)
	private LocalDate calledOn;
	@Column(name="calledBy",nullable = false)
	private long calledBy;
	@Column(name="calledTo",nullable = false)
	private long calledTo;
	@Column(name="duration(In secends)",nullable = false)
	private String duration;
}