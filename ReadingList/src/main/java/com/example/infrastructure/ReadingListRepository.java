package com.example.infrastructure;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.Book;

public interface ReadingListRepository extends JpaRepository<Book, Long> {
	
	List<Book> findByReader(String reader);
	
	/*
	 * Q. Spring Data JPA에서 정의한 Repository Interface는 언제 구현됨?
	 * A. 런타임(어플리케이션이 시작할 때)에 자동으로 구
	 */
	
}
