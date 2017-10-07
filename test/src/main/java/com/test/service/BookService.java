package com.test.service;

import java.util.List;

import com.test.model.Book;


public interface BookService 
{
	List<Book> getBookList();
    Book getBookById (int id);
    void addBook(Book book);
    void editBook(Book book);
    void deleteBook(Book book);
}
