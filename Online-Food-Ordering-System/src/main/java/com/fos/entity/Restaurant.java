package com.fos.entity;

import java.awt.Menu;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Restaurant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long restaurantId;
	
	@Column(length = 20, nullable= false)
	private String name;
	
	@Column(length=20, nullable = false)
	private String description;
	
	@Column(length= 20, nullable= false)
	private String address;
	
	@Column(length=20, nullable= false)
	private String email;
	
	@Column(length= 10, nullable=false)
	private String PhoneNo;
	
	@OneToMany
	private List<Menu>menus;

}
