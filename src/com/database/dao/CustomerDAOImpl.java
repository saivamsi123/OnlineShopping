package com.database.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.allianz.shopping.dao.CustomerDAO;
import com.allianz.shopping.model.Category;
import com.allianz.shopping.model.Customer;
import com.utility.DBUtility;

public class CustomerDAOImpl implements CustomerDAO{
	static Connection conn = null;
	static PreparedStatement pst = null;
	static Customer customer;
	@Override
	public boolean addCustomers(Customer customer) {
		try {
			conn = DBUtility.getConnection();
			pst = conn.prepareStatement("insert into customer(customerId, username, password, email, phoneNo, landmark, address, pinNo, city) values(?,?,?,?,?,?,?,?,?)");
			pst.setInt(1, customer.getCustomerId());
			pst.setString(2, customer.getCustomerName());
			pst.setString(3, customer.getPassword());
			pst.setString(4, customer.getEmail());
			pst.setString(5, customer.getPhoneNo());
			pst.setString(6, customer.getLandmark());
			pst.setString(7, customer.getAddress());
			pst.setString(8, customer.getPinNo());
			pst.setString(9, customer.getCity());
			int i = pst.executeUpdate();
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean login(String username, String password) {
		try {
			Customer customer = new Customer();
			conn = DBUtility.getConnection();
			pst = conn.prepareStatement("select username,password from customer where username=? and password=?");
			pst.setString(1, username);
			pst.setString(2, password);
			ResultSet rs = pst.executeQuery();
			return rs.first();
			
			/*
			 * if(rs.next()) { customer.setCustomerName(rs.getString(username));
			 * customer.setPassword(rs.getString(password));
			 * if(customer.getCustomerName().equals(username) &&
			 * customer.getPassword().equals(password)) return true; }
			 */
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Customer getCustomerByUsername(String username) {
		
			try {
				Customer customer = new Customer();
				conn = DBUtility.getConnection();
				pst = conn.prepareStatement("select username,password,phoneNo from customer where username=?");
				pst.setString(1, username);
				
				ResultSet rs = pst.executeQuery();
				  if(rs.next()) { 
				   customer.setCustomerName(rs.getString("username"));
				  customer.setPassword(rs.getString("password"));
				  customer.setPhoneNo(rs.getString("phoneNo"));
				  }
				 return customer;
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
		}

	

}
