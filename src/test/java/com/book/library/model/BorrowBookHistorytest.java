package com.book.library.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class BorrowBookHistorytest {

	@InjectMocks
	BookBorrowHistory entitHistory = new BookBorrowHistory();

	@Before
	public void SetUp() {

		entitHistory.setBookId("1");
		entitHistory.setIssue_date("22/10/1996");
		entitHistory.setReturn_date("22/10/1996");
		entitHistory.setTotalFine("10");
		entitHistory.setUserId("2");
	}

	@Test
	public void  testModel() {
		
		Assert.assertEquals("1", entitHistory.getBookId());
		Assert.assertEquals("1", entitHistory.getIssue_date());
		Assert.assertEquals("1", entitHistory.getReturn_date());
		Assert.assertEquals("1", entitHistory.getTotalFine());
	    Assert.assertEquals("1", entitHistory.getUserId());
	}

}
