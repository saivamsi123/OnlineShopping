package com.database.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.allianz.shopping.dao.CustomerDAO;
import com.allianz.shopping.dao.OrderDAO;
import com.allianz.shopping.model.Customer;
import com.allianz.shopping.model.Order;
import com.utility.DBUtility;
import com.utility.DateUtility;

public class OrderDAOImpl implements OrderDAO {

	static CustomerDAO customerDao = new CustomerDAOImpl();
	@Override
	public int addOrder(Order order) {
		int index = 0;
		Connection conn;
		PreparedStatement pst;
		try {
			conn = DBUtility.getConnection();
			String sql_statement = "insert into order_(orderDate, orderStatus, username, totalPrice) values(?,?,?,?)";
			pst = conn.prepareStatement(sql_statement, Statement.RETURN_GENERATED_KEYS);
			pst.setDate(1, (java.sql.Date) order.getOrderDate());
			pst.setString(2, order.getStatus());
			pst.setString(3, order.getUsername());
			pst.setFloat(4, order.getTotalPrice());
			int i = pst.executeUpdate();
			
			ResultSet rs = null;
			rs = pst.getGeneratedKeys();
			if(rs.next())
			{
				return rs.getInt(1);
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return 0;
		}
		return 0;
	}

	@Override
	public boolean deleteOrder(int id) {
//		try {
//			conn = DBUtility.getConnection();
//			String sql_statement = "insert into order_(orderDate, orderStatus, username, totalPrice) values(?,?,?,?)";
//			pst = conn.prepareStatement(sql_statement, Statement.RETURN_GENERATED_KEYS);
//			pst.setDate(1, (java.sql.Date) order.getOrderDate());
//			pst.setString(2, order.getStatus());
//			pst.setString(3, order.getUsername());
//			pst.setFloat(4, order.getTotalPrice());
//			int i = pst.executeUpdate();
//			
//			ResultSet rs = null;
//			rs = pst.getGeneratedKeys();
//			if(rs.next())
//			{
//				return rs.getInt(1);
//			}
//		}
//		catch(Exception ex)
//		{
//			ex.printStackTrace();
//			return 0;
//		}
		return false;
	}

	@Override
	public Order getOrderById(int orderId) {
		Connection conn;
		PreparedStatement pst;
		int orderId1 = 0;
		String orderDate, orderStatus, username = null;
		float orderTotal = 0.0f;
		try {
			conn = DBUtility.getConnection();
			String sql_statement = "select * from order_ where orderId = orderId;";
			pst = conn.prepareStatement(sql_statement);
			ResultSet rs = pst.executeQuery(); 
			while(rs.next())
			{
				Order order = new Order();
				orderId1 = rs.getInt(1);
				orderDate = DateUtility.connectDateToString(rs.getDate(2));
				orderStatus = rs.getString(3);
				username = rs.getString(4);
				orderTotal = rs.getFloat(5);
			}
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Order> getAllOrders() {
		Connection conn;
		PreparedStatement pst;
		List<Order> list = new ArrayList<Order>();
		int orderId = 0;
		String orderDate, orderStatus, username = null;
		float orderTotal = 0.0f;
		String name="customer1";
		try {
			conn = DBUtility.getConnection();
			String sql_statement = "select * from order_ where username='"+name+"'";
			pst = conn.prepareStatement(sql_statement);
			ResultSet rs = null;
			rs = pst.executeQuery();
			while(rs.next())
			{
				Order order = new Order();
				order.setOrderId(rs.getInt("orderId"));
				order.setOrderDate(rs.getDate("orderDate"));
				order.setStatus(rs.getString("orderStatus"));
				order.setUsername(rs.getString("username"));
				order.setTotalPrice(rs.getFloat("totalPrice"));
				Customer customer = customerDao.getCustomerByUsername(order.getUsername());
				order.getCustomer().setPhoneNo(customer.getPhoneNo());
				list.add(order);
			}
			return list;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return null;
	}
}
