package com.gymowner.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "gym_owner", catalog = "dbo")
public class GymOwner {

	@Id
	@Column(name = "owner_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "mobile_number")
	private Integer mobileNumber;

	/*
	 * public Integer getMobileNumber() { return mobileNumber; }
	 * 
	 * public void setMobileNumber(Integer mobileNumber) { this.mobileNumber =
	 * mobileNumber; }
	 */

	@Column(name = "password")
	private String password;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "owner_name")
	private String ownerName;

	@Column(name = "email")
	private String email;

	/*
	 * @Column(name = "created_at") private Integer createdAt;
	 */
	/*
	 * @Transient private Integer age;
	 * 
	 * @Temporal(TemporalType.DATE) private Date birthDate;
	 * 
	 * @Enumerated(EnumType.STRING) private String gender;
	 */

	// other fields, getters and setters
}
