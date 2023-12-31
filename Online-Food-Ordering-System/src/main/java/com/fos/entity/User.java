package com.fos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)


public class User {

		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		
		@Column(length=20, nullable=false)
		private String userName;
		
		@Column(length=20, nullable=false)
		private String password;
		
		@Column(length=20, nullable=false)
		private String email;
		
		@Column(length=10, nullable=false)
		private String PhoneNo;
		
		@Column(nullable=false)
		private String address;
		
		
		

}
