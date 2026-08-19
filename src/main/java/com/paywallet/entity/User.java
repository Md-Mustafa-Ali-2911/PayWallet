package com.paywallet.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@Column(unique = true, nullable = false)
	private String email;
	
	private String password;
	
	private String phone;
	
	private LocalDateTime createdAt;

}
