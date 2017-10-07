package com.test.service;

import com.test.model.Cart;
import com.test.model.CartItem;

public interface CartItemService {
	void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByBookId(int bookId);
}
