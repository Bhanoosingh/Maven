package com.test.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.test.dao.BookDAO;
import com.test.model.Book;


@Repository
@Transactional
public class BookDAOImpl implements BookDAO {

	 @Autowired
	 private SessionFactory sessionFactory;
	 
	@SuppressWarnings("unchecked")
	public List<Book> getBookList() {
		Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Book");
        List<Book> bookList = query.list();
        session.flush();
        return bookList;
	}

	
	public Book getBookById(int id) {
		Session session = sessionFactory.getCurrentSession();
        Book book = (Book) session.get(Book.class, id);
        session.flush();

        return book;
	}

	
	public void addBook(Book book) {
		Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(book);
        session.flush();

	}

	
	public void editBook(Book book) {
		Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(book);
        session.flush();

	}

	
	public void deleteBook(Book book) {
		Session session = sessionFactory.getCurrentSession();
        session.delete(book);
        session.flush();

	}

}
