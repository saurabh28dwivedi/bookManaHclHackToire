import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.validation.BindingResult;

import com.book.library.model.BookBorrowHistory;
import com.book.library.service.BorrowBookHistoryService;

@RunWith(MockitoJUnitRunner.class)
public class BorrowBookControllerTest {

	@InjectMocks
	private BorrowBookHistoryController borrowBookHistoryController = new BorrowBookHistoryController();

	@Mock
	private BorrowBookHistoryService BorrowBookHistoryService;
	@Mock
	BookBorrowHistory BookBorrowHistory;

	@Test
	public void testCreatehistory() throws Exception {
		 BorrowBookHistoryService.createHistory(BookBorrowHistory);
		 Assert.assertNotNull(BookBorrowHistory);

}
	@Test
	public void testgetList() throws Exception {
		 BorrowBookHistoryService.getList();
		 Assert.assertNotNull(BookBorrowHistory);
}
}
