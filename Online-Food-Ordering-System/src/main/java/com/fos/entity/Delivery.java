package com.fos.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Delivery {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long DeliveryId;
	
	@Column(length =20, nullable=false)
	private LocalDateTime DeliveryDate;
	
	@Column(length=20, nullable= false)
	private String Address;
	
	@Column(length=20, nullable=false)
	private String Status;
	
	@OneToOne
    @JoinColumn(name = "order_id")
    private Order order;


}
