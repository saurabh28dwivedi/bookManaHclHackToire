package com.book.library.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import com.book.library.controller.BookStatus;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString 
@Table(name = "Book")

public class Book {


    @Id	        
    @GeneratedValue(generator = "UUID",strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Type(type = "uuid-char")
    @Column(name = "bookIdUUID", unique=true ,updatable = false, nullable = false,length=36)
	 private UUID BookId;

	 @Column(name = "bookTitle")
	 private String bookTitle;
	
	 @Column(name = "author")
	 private String author;
	
	 @Column(name = "category")    
	 private String Category;
	
	 @Enumerated(EnumType.STRING)
	 @Column(name = "status")   
	 private BookStatus status;
		
}
