package com.mer.dao.items.books;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mer.dto.items.books.BookDTO;

@Repository
public interface BookRepositry extends JpaRepository<BookDTO, Integer>{

}
