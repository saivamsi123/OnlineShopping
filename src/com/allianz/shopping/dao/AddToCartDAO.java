package com.allianz.shopping.dao;

import java.util.List;

import com.allianz.shopping.model.AddToCart;

public interface AddToCartDAO {
	public int addToCart(AddToCart addToCart);
	public boolean deleteFromCart(int id);
	
	public List<AddToCart> getAllAddToCartByOrderId(int order_id);
}
