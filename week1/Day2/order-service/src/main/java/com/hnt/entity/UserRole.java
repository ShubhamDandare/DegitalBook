//package com.hnt.entity;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Entity
//public class UserRole {
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Long id;
//	
//	private String role;
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getRole() {
//		return role;
//	}
//
//	public void setRole(String role) {
//		this.role = role;
//	}
//
//	@Override
//	public String toString() {
//		return "UserRole [id=" + id + ", role=" + role + "]";
//	}
//
//	public UserRole(Long id, String role) {
//		super();
//		this.id = id;
//		this.role = role;
//	}
//
//	public UserRole() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	
//}
