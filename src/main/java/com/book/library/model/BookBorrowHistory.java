package com.book.library.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name="BookBorrowHistory")

public class BookBorrowHistory {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;

	@Column(nullable = false, unique = true, length = 45)
	private String bookId;

	@Column(nullable = false, unique = true, length = 45)
	private String UserId;

	@Column(nullable = false, unique = true, length = 45)
	private String Issue_date;

	@Column(nullable = false, unique = true, length = 45)
	private String return_date;

	@Column(nullable = false, unique = true, length = 45)
	private String TotalFine;

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	public String getIssue_date() {
		return Issue_date;
	}

	public void setIssue_date(String issue_date) {
		Issue_date = issue_date;
	}

	public String getReturn_date() {
		return return_date;
	}

	public void setReturn_date(String return_date) {
		this.return_date = return_date;
	}

	public String getTotalFine() {
		return TotalFine;
	}

	public void setTotalFine(String totalFine) {
		TotalFine = totalFine;
	}

}
