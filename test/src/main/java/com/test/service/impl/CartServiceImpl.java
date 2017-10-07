package com.test.service.impl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.CartDAO;
import com.test.model.Cart;
import com.test.service.CartService;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartDAO cartDAO;
	public Cart getCartById(int cartId) {
		return cartDAO.getCartById(cartId);
	}

	
	public Cart validate(int cartId) throws IOException {
		return cartDAO.validate(cartId);
	}

	
	public void update(Cart cart) {
		cartDAO.update(cart);

	}

}
