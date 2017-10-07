package com.test.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.test.dao.CartItemDAO;
import com.test.model.Cart;
import com.test.model.CartItem;

@Repository
@Transactional
public class CartItemDAOImpl implements CartItemDAO {

	@Autowired
    private SessionFactory sessionFactory;
	
	public void addCartItem(CartItem cartItem) {
		Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(cartItem);
        session.flush();

	}

	 
	public void removeCartItem(CartItem cartItem) {
		 	Session session = sessionFactory.getCurrentSession();
	        session.delete(cartItem);
	        session.flush();

	}

	 
	public void removeAllCartItems(Cart cart) {
		List<CartItem> cartItems = cart.getCartItems();

        for (CartItem item : cartItems){
            removeCartItem(item);
        }

	}

	 
	public CartItem getCartItemByBookId(int bookId) {
		Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from CartItem where bookId = ?");
        query.setInteger(0, bookId);
        session.flush();

        return (CartItem) query.uniqueResult();
	}

}
