package com.test.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.test.dao.StudentOrderDAO;
import com.test.model.StudentOrder;

@Repository
@Transactional
public class StudentOrderDAOImpl implements StudentOrderDAO {

	@Autowired
    private SessionFactory sessionFactory;
	public void addStudentOrder(StudentOrder studentOrder) {
		Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(studentOrder);
        session.flush();

	}

}
