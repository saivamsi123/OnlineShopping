package com.database.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.allianz.shopping.dao.CategoryDAO;
import com.allianz.shopping.dao.ProductDAO;
import com.allianz.shopping.model.Category;
import com.allianz.shopping.model.Product;
import com.utility.DBUtility;
import com.utility.DateUtility;

public class ProductDatabaseDAOImpl implements ProductDAO {
	static Connection conn = null;
	static PreparedStatement pst = null;
	static CategoryDAO categoryDao = new CategoryDAOImpl();
	@Override
	public boolean addProduct(Product product) {
		try {
			conn = DBUtility.getConnection();
			pst = conn.prepareStatement("insert into product(id, code, description, price, mfgDate) values(?,?,?,?,?)");
			pst.setInt(1, product.getId());
			pst.setString(2, product.getCode());
			pst.setString(3, product.getDescription());
			pst.setFloat(4, product.getPrice());
			pst.setDate(5, DateUtility.convertUtiltoSql(product.getMfgDate()));
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
	public boolean updateProduct(Product product) {
		try {
			conn = DBUtility.getConnection();
			pst = conn.prepareStatement("update product set id='"+product.getId()+"', code='"+product.getCode()+"', "
					+ "description='"+product.getDescription()+"',price='"+product.getPrice()+"',"
							+ "mfgDate='"+DateUtility.convertUtiltoSql(product.getMfgDate())+"' where id='"+product.getId()+"'");
			int i = pst.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteProduct(int id) {
		try {
			conn = DBUtility.getConnection();
			pst = conn.prepareStatement("delete from product where id='"+id+"'");
			int i = pst.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Product> getAllProducts() {
		java.util.Date date = null;
		float price = 0;
		int id = 0;
		String code = null, description = null;
		try {
			conn = DBUtility.getConnection();
			pst = conn.prepareStatement("select * from product");
			ResultSet rs = pst.executeQuery();
			List<Product> productList = new ArrayList<Product>();
			while(rs.next())
			{
				Product product = new Product();
				product.setId(rs.getInt(1));
				product.setCode(rs.getString(2));
				product.setDescription(rs.getString(3));
				product.setPrice(rs.getFloat(4));
				product.setMfgDate((java.util.Date)rs.getDate(5));
				product.setCategoryList(categoryDao.getAllCategoriesByProductId(product.getId()));
				productList.add(product);
			}
			return productList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Product> getAllProductsByName(String name) {
		java.util.Date date = null;
		float price = 0;
		int id = 0;
		String code = null, description = null;
		try {
			conn = DBUtility.getConnection();
			pst = conn.prepareStatement("select * from product where code='"+name+"'");
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				id = rs.getInt(1);
				code = rs.getString(2);
				description = rs.getString(3);
				price = rs.getFloat(4);
				date = (java.util.Date)rs.getDate(5);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Product> getAllProductsByPrice(float max, float min) {
		return null;
	}

	@Override
	public Product getProductById(int id) {
		try {
			conn = DBUtility.getConnection();
			pst = conn.prepareStatement("select * from product where id='"+id+"'");
			ResultSet rs = pst.executeQuery();
			Product product = new Product();
			if(rs.next())
			{
				product.setId(rs.getInt(1));
				product.setCode(rs.getString(2));
				product.setDescription(rs.getString(3));
				product.setPrice(rs.getFloat(4));
				product.setMfgDate((java.util.Date)rs.getDate(5));
				product.setCategoryList(categoryDao.getAllCategoriesByProductId(product.getId()));
			}
			return product;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Product> getAllProductsByCategoryId(int category_id) {
		try {
			conn = DBUtility.getConnection();
			pst = conn.prepareStatement("select * from product where id in(select product_id from product_category where category_id='"+category_id+"')");
			ResultSet rs = pst.executeQuery();
			List<Product> productList = new ArrayList<Product>();
			while(rs.next())
			{
				Product product = new Product();
				product.setId(rs.getInt(1));
				product.setCode(rs.getString(2));
				product.setDescription(rs.getString(3));
				product.setPrice(rs.getFloat(4));
				product.setMfgDate((java.util.Date)rs.getDate(5));
				productList.add(product);
			}
			return productList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
