package com.database.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.allianz.shopping.dao.AddToCartDAO;
import com.allianz.shopping.model.AddToCart;
import com.allianz.shopping.model.Order;
import com.allianz.shopping.model.Product;
import com.utility.DBUtility;
import com.utility.DateUtility;

public class AddToCartDAOImpl implements AddToCartDAO {

	@Override
	public int addToCart(AddToCart addToCart) {
		int index = 0;
		Connection conn;
		PreparedStatement pst;
		try {
			conn = DBUtility.getConnection();
			pst = conn.prepareStatement("insert into addtocart(orderId, product_id, quantity, total) values(?,?,?,?)");
			pst.setInt(1, addToCart.getOrder_id());
			pst.setInt(2, addToCart.getProduct_id());
			pst.setInt(3, addToCart.getQuantity());
			pst.setFloat(4, addToCart.getTotal());
			int i = pst.executeUpdate();
			return i;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return 0;
	}

	@Override
	public boolean deleteFromCart(int id) {
		return false;
	}

//	@Override
//	public boolean addAddToCart(AddToCart addToCart) {
//		Connection conn;
//		PreparedStatement pst;
//		try {
//			conn = DBUtility.getConnection();
//			pst = conn.prepareStatement("");
//			pst.setInt(1, addToCart.getOrder_id());
//			pst.setInt(2, addToCart.getProduct_id());
//			pst.setInt(3, addToCart.getQuantity());
//			pst.setFloat(4, addToCart.getTotal());
//			int i = pst.executeUpdate();
//		}
//		catch(Exception ex)
//		{
//			ex.printStackTrace();
//		}
//		return false;
//	}

	@Override
	public List<AddToCart> getAllAddToCartByOrderId(int order_id) {
		Connection conn;
		PreparedStatement pst;
		List<AddToCart> addToCart = new ArrayList<AddToCart>();
		try {
			conn = DBUtility.getConnection();
			pst = conn.prepareStatement("select DISTINCT product.id, product.code, product.price, addtocart.quantity, addtocart.total from product INNER JOIN addtocart, order_ where product.id=addtocart.product_id and order_.orderId='"+order_id+"' and order_.username=\"customer1\"");
			ResultSet rs = pst.executeQuery(); 
			while(rs.next())
			{
				
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return null;
	}
}
