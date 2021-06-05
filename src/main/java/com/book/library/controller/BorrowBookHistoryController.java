package com.book.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.library.model.BookBorrowHistory;
import com.book.library.service.BorrowBookHistoryService;

@RestController
@RequestMapping(value = "/history")
public class BorrowBookHistoryController {

	@Autowired
	BorrowBookHistoryService borrowBookHistory;

	@PostMapping(path = "/create", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Void> addHisTory(@RequestBody BookBorrowHistory BookBorrowHistory) {

		BookBorrowHistory entitHistory = new BookBorrowHistory();
		System.out.println("Creating history for  " + BookBorrowHistory.getBookId());
		entitHistory.setBookId(BookBorrowHistory.getBookId());
		entitHistory.setIssue_date(BookBorrowHistory.getIssue_date());
		entitHistory.setReturn_date(BookBorrowHistory.getReturn_date());
		entitHistory.setTotalFine(BookBorrowHistory.getTotalFine());
		entitHistory.setUserId(BookBorrowHistory.getUserId());
		borrowBookHistory.createHistory(entitHistory);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@GetMapping(value = "/getListOfBook", headers = "Accept=application/json")
	public List<BookBorrowHistory> ListHistory() {
		List<BookBorrowHistory> histoyList = borrowBookHistory.getList();
		return histoyList;

	}

}
