package com.test.dao;

import com.test.model.Cart;
import com.test.model.CartItem;

public interface CartItemDAO {
	void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByBookId(int bookId);
}
