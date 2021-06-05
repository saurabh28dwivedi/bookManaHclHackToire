package com.book.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.library.model.BookBorrowHistory;

@Repository
public interface BorrowBookRepository extends JpaRepository<BookBorrowHistory, Long>{
	
}
