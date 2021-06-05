package com.book.library.service;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.book.library.model.BookBorrowHistory;

import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.class)
public class BorrowBookHistoryServiceTest {

	
	@InjectMocks
	BorrowBookHistoryService BorrowBookHistoryService;
	
	@Mock 
	BookBorrowHistory bookBorrowHistory;
	
	@Test
	public void testCreatedata() {
		Assert.assertNotNull(BorrowBookHistoryService);
	}
	
	@Test
	public void testGetLink() {
		Assert.assertNotNull(BorrowBookHistoryService);
	}
}
