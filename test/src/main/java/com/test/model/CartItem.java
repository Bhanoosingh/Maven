package com.test.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.test.model.Book;

@Entity
public class CartItem implements Serializable 
{
	private static final long serialVersionUID = -6402369984884714277L;
	 	@Id
	    @GeneratedValue
	    private int cartItemId;
	 	@ManyToOne
	    @JoinColumn(name = "cartId")
	    @JsonIgnore
	    private Cart cart;

	    @ManyToOne
	    @JoinColumn(name = "bookId")
	    private Book book;

	    private int quantity;
	    private double totalPrice;

	    public int getCartItemId() {
			return cartItemId;
		}
		public void setCartItemId(int cartItemId) {
			this.cartItemId = cartItemId;
		}
		public Cart getCart() {
			return cart;
		}
		public void setCart(Cart cart) {
			this.cart = cart;
		}
		public Book getBook() {
			return book;
		}
		public void setBook(Book book) {
			this.book = book;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public double getTotalPrice() {
			return totalPrice;
		}
		public void setTotalPrice(double totalPrice) {
			this.totalPrice = totalPrice;
		}
		
	

}
