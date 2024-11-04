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
@Table(name="Plan_Details")
@AllArgsConstructor
@NoArgsConstructor
public class Plan {
	@Id
	@Column(name = "plan_id",  nullable = false)
	private Integer planId;
	@Column(name = "plan_name", nullable = false, length = 50)
	private String planName;
	@Column(name = "national_rate", nullable = false)
	private Integer nationalRate;
	@Column(name = "local_rate", nullable = false)
	private Integer localRate;
}
