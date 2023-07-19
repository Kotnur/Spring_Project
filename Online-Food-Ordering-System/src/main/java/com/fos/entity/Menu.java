package com.fos.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

@Entity
public class Menu {
	
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private long menuId;
	
	@Column(length= 20, nullable= false)
	private String name;
	
	@Column(length= 20, nullable= false)
	private String description;
	
	@Column(length= 20, nullable= false)
	private int availableQuantity;
	
	@Column(length=20, nullable= false)
	private double price;
	
	@OneToMany
	private List<Item> items;
	
	@ManyToOne
	private Restaurant restaurants;
	

}
