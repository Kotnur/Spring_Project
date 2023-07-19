package com.fos.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

public class Order {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long orderId;
	
	@Column(length= 20, nullable= false)
	private LocalDateTime orderDateTime;
	
	@ManyToOne
	private User customer;
	
	@ManyToMany
    private List<Menu> menus;

}
