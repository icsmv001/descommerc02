package com.devsuperior.ics.dscommerce.entities;
// entity User criada.

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;
	private String name;
	
	@Column(unique=true)
	private String email;
	private String phone;
	
	private LocalDate birth_Date;
	
	private String password;
	
	@OneToMany(mappedBy = "client")
	private List<Order> orders = new ArrayList<>();

	
	public User() {
		
	}


	public User(Long id, String name, String email, String phone, LocalDate birtDate, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.birth_Date = birth_Date;
		this.password = password;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public LocalDate getBirth_Date() {
		return birth_Date;
	}


	public void setBirth_Date(LocalDate birth_Date) {
		this.birth_Date = birth_Date;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public List<Order> getOrders() {
		return orders;
	}
	
	
	
	
	
}
