package com.test.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class StudentOrder implements Serializable
{

	private static final long serialVersionUID = 6741326070227959929L;
	 	
		@Id
	    @GeneratedValue
	    private int studentOrderId;

	    @OneToOne
	    @JoinColumn(name = "cartId")
	    private Cart cart;

	    @OneToOne
	    @JoinColumn(name = "studentId")
	    private Student student;

	    @OneToOne
	    @JoinColumn(name = "studentAddressId")
	    private studentAddress studentAddress;

		public int getStudentOrderId() {
			return studentOrderId;
		}

		public void setStudentOrderId(int studentOrderId) {
			this.studentOrderId = studentOrderId;
		}

		public Cart getCart() {
			return cart;
		}

		public void setCart(Cart cart) {
			this.cart = cart;
		}

		public Student getStudent() {
			return student;
		}

		public void setStudent(Student student) {
			this.student = student;
		}

		public studentAddress getStudentAddress() {
			return studentAddress;
		}

		public void setStudentAddress(studentAddress studentAddress) {
			this.studentAddress = studentAddress;
		}


}
