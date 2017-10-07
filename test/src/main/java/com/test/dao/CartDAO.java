package com.test.dao;

import java.io.IOException;

import com.test.model.Cart;


public interface CartDAO 
{
	Cart getCartById(int cartId);
    Cart validate(int cartId) throws IOException;
    void update(Cart cart);
}
