package com.test.dao;

import java.util.List;

import com.test.model.Book;


public interface BookDAO 
{
	List<Book> getBookList();
    Book getBookById (int id);
    void addBook(Book book);
    void editBook(Book book);
    void deleteBook(Book book);
}
