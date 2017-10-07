package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.StudentOrderDAO;
import com.test.model.Cart;
import com.test.model.CartItem;
import com.test.model.StudentOrder;
import com.test.service.CartService;
import com.test.service.StudentOrderService;


@Service
public class StudentOrderServiceImpl implements StudentOrderService {

	@Autowired
	private StudentOrderDAO studentOrderDAO;
	
	@Autowired
    private CartService cartService;
	
	public void addStudentOrder(StudentOrder studentOrder) {
		studentOrderDAO.addStudentOrder(studentOrder);
	}

	public double getStudentOrderGrandTotal(int cartId) {
		double grandTotal = 0;
        Cart cart = cartService.getCartById(cartId);
        List<CartItem> cartItems = cart.getCartItems();

        for (CartItem item : cartItems){
            grandTotal += item.getTotalPrice();
        }

        return grandTotal;
	}

}
