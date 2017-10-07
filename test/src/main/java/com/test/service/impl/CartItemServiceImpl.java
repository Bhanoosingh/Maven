package com.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.CartItemDAO;
import com.test.model.Cart;
import com.test.model.CartItem;
import com.test.service.CartItemService;


@Service
public class CartItemServiceImpl implements CartItemService {

	@Autowired
	private CartItemDAO cartItemDAO;
	
	public void addCartItem(CartItem cartItem) {
		cartItemDAO.addCartItem(cartItem);

	}

	
	public void removeCartItem(CartItem cartItem) {
		cartItemDAO.removeCartItem(cartItem);

	}

	
	public void removeAllCartItems(Cart cart) {
		cartItemDAO.removeAllCartItems(cart);

	}

	
	public CartItem getCartItemByBookId(int bookId) {
		
		return cartItemDAO.getCartItemByBookId(bookId);
	}

}
