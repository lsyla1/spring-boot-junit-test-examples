package com.jspec.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
// import javax.persistence.ManyToMany;
import javax.persistence.Table;

import java.util.Date;

@Entity
@Table(name="users")
public class User {

	@Id
	@GeneratedValue
	private int Id;
	
	@Column(name = "username")
	private String userName; 

	@Column(name = "password")
	private String password; 
	
	@Column(name = "role_id")
	private int roleId;
	
	@Column(name = "created_at")
	private Date createdAt;
	
	@Column(name = "updated_at")
	private Date updatedAt;
	
	public User() {
		
	}
	
}
