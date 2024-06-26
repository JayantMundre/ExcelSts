package com.codewithjay.blog.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Registration {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String gender;
	private String address;
	private String email;
	private String password;
	
	public Registration() {
		super();
	
	}
		public Registration(int id, String name, String gender, String address, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.email = email;
		this.password = password;
	}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		@Override
		public String toString() {
			return "Registration [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address
					+ ", email=" + email + ", password=" + password + "]";
		}



}
