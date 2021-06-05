package com.book.library.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.book.library.model.BookBorrowHistory;
import com.book.library.service.BorrowBookHistoryService;

@RunWith(MockitoJUnitRunner.class)
public class BorrowBookRepositoryTest {

	@InjectMocks
	private BorrowBookRepository BorrowBookRepository;

	@Mock
	private BorrowBookHistoryService BorrowBookHistoryService;
	
	@Mock
	BookBorrowHistory BookBorrowHistory;
	
	
	@Test
	public void repository() throws Exception {
		 BorrowBookHistoryService.createHistory(BookBorrowHistory);
		 BorrowBookHistoryService.getList();
		 Assert.assertNotNull(BookBorrowHistory);

}
}
