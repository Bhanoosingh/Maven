package com.test.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.test.dao.StudentDAO;
import com.test.model.Authorities;
import com.test.model.Cart;
import com.test.model.Student;
import com.test.model.Users;





@Repository
@Transactional
public class StudentDAOImpl implements StudentDAO {

	@Autowired
    private SessionFactory sessionFactory;
	
	public void addStudent(Student student) {
		Session session = sessionFactory.getCurrentSession();

        student.getstudentAddress().getstudent();
        session.saveOrUpdate(student);
        session.saveOrUpdate(student.getstudentAddress());
        

        Users newUser = new Users();
        newUser.setUsername(student.getUsername());
        newUser.setPassword(student.getPassword());
        newUser.setEnabled(true);
        newUser.setstudentId(student.getstudentId());

        Authorities newAuthorities = new Authorities();
        newAuthorities.setUsername(student.getUsername());
        newAuthorities.setAuthority("ROLE_USER");

        session.saveOrUpdate(newUser);
        session.saveOrUpdate(newAuthorities);

        Cart newCart = new Cart();
        newCart.setstudent(student);
        student.setCart(newCart);
        session.saveOrUpdate(student);
        session.saveOrUpdate(newCart);
        session.flush();

	}

	
	public Student getStudentById(int studentId) {
		 Session session = sessionFactory.getCurrentSession();
	        return (Student) session.get(Student.class, studentId);
	}

	
	@SuppressWarnings("unchecked")
	public List<Student> getAllStudents() {
		Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Student");
        List<Student> studentList = query.list();
		return studentList;
	}

	
	public Student getStudentByUsername(String username) {
		Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Student where username = ?");
        query.setString(0, username);


        return (Student) query.uniqueResult();
	}

}
