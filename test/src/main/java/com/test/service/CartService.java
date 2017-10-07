package com.test.service;

import java.io.IOException;

import com.test.model.Cart;


public interface CartService 
{
	Cart getCartById(int cartId);
    Cart validate(int cartId) throws IOException;
    void update(Cart cart);
}
