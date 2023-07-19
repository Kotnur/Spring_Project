package com.fos.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Item {
	
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private long itemId;
	
	@Column(length= 15, nullable=false)
	private String name;
	
	@Column(length= 20, nullable= false)
	private String description;
	
	@Column(length= 20, nullable= false)
	private int price;
	
	@ManyToOne
	private Menu menus;

}
