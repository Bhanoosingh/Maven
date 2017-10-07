package com.test.service;

import com.test.model.StudentOrder;

public interface StudentOrderService {
	void addStudentOrder(StudentOrder studentOrder);

    double getStudentOrderGrandTotal(int cartId);

}
