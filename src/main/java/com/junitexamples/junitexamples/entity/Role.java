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
@Table(name="roles")
public class Role {

	@Id
	@GeneratedValue
	private int Id;
	
	@Column(name = "role_name")
	private String name;
	
	public Role() {
		
	}
	
}
