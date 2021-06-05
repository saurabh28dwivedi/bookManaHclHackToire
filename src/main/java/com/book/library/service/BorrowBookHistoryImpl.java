package com.book.library.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.library.model.BookBorrowHistory;
import com.book.library.repository.BorrowBookRepository;

@Service
@Transactional
public class BorrowBookHistoryImpl implements BorrowBookHistoryService {

	@Autowired
	BorrowBookRepository borrowBookHistory;

	@Override
	public List<BookBorrowHistory> getList() {
		return borrowBookHistory.findAll();
	}

	@Override
	public void createHistory(BookBorrowHistory BookBorrowHistory) {
		// TODO Auto-generated method stub
		borrowBookHistory.save(BookBorrowHistory);
	}

	
	

}
