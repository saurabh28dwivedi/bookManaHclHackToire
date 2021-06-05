package com.book.library.service;



import java.util.List;

import com.book.library.model.BookBorrowHistory;

public interface BorrowBookHistoryService  {
	List <BookBorrowHistory> getList();
	
	public void createHistory( BookBorrowHistory BookBorrowHistory);

	
}
