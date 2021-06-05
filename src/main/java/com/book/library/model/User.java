package com.book.library.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "User")
@Getter
@Setter
@ToString
public class User {
	
	private String UserId;
	private String Password;
	private String UserTypeUser;

}
