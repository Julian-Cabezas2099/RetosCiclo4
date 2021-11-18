package com.Reto1.springboot.app.Models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User implements Serializable {



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable=false, length=50, unique=true)
	private String user_email;
	
	@Column(nullable=false, length=80)
	private String user_namevarchar;
	
	@Column(nullable=false, length=50)
	private String user_passwordvarchar;

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_namevarchar() {
		return user_namevarchar;
	}

	public void setUser_namevarchar(String user_namevarchar) {
		this.user_namevarchar = user_namevarchar;
	}

	public String getUser_passwordvarchar() {
		return user_passwordvarchar;
	}

	public void setUser_passwordvarchar(String user_passwordvarchar) {
		this.user_passwordvarchar = user_passwordvarchar;
	}
	
	
}
