package com.allianz.shopping.dao;

import java.util.List;

import com.allianz.shopping.model.Order;

public interface OrderDAO {
	public int addOrder(Order order);
	public boolean deleteOrder(int id);
	
	public Order getOrderById(int orderId);
	public List<Order> getAllOrders();
}
