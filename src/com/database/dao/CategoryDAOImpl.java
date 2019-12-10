package com.database.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.allianz.shopping.dao.CategoryDAO;
import com.allianz.shopping.model.Category;
import com.allianz.shopping.model.Product;
import com.utility.DBUtility;
import com.utility.DateUtility;

public class CategoryDAOImpl implements CategoryDAO{
	static Connection conn = null;
	static PreparedStatement pst = null;
	@Override
	public boolean addCategory(Category category) {
		try {
			conn = DBUtility.getConnection();
			pst = conn.prepareStatement("insert into category(category_id, category_code, category_description) values(?,?,?)");
			pst.setInt(1, category.getCid());
			pst.setString(2, category.getCcode());
			pst.setString(3, category.getCdescription());
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
	public boolean updateCategory(Category category) {
		try {
			conn = DBUtility.getConnection();
			pst = conn.prepareStatement("update category set category_id='"+category.getCid()+"', code='"+category.getCcode()+"', description='"+category.getCdescription()+"'"
					+ "where category_Id='"+category.getCid()+"'");
			int i = pst.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteCategory(int id) {
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
	public List<Category> getAllCategoriesByProductId(int id) {
		try {
			List<Category> categoryList = new ArrayList<Category>();
			conn = DBUtility.getConnection();
			pst = conn.prepareStatement("select * from category where category_Id in(select category_id from product_category where product_id='"+id+"')");
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				Category category = new Category();
				category.setCid(rs.getInt(1));
				category.setCcode(rs.getString(2));
				category.setCdescription(rs.getString(3));
				categoryList.add(category);
			}
			return categoryList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Category getCategoryById(int id) {
		try {
			conn = DBUtility.getConnection();
			pst = conn.prepareStatement("select * from category where id='"+id+"'");
			ResultSet rs = pst.executeQuery();
			Category category = new Category();
			while(rs.next())
			{
				category.setCid(rs.getInt(1));
				category.setCcode(rs.getString(2));
				category.setCdescription(rs.getString(3));
			}
			return category;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Category> getCategoryByName(String cname) {
		try {
			List<Category> categoryList = new ArrayList<Category>();
			conn = DBUtility.getConnection();
			pst = conn.prepareStatement("select * from category where category_code='"+cname+"'");
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				Category category = new Category();
				category.setCid(rs.getInt(1));
				category.setCcode(rs.getString(2));
				category.setCdescription(rs.getString(3));
				categoryList.add(category);
			}
			return categoryList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Category> getAllCategories() {
		try {
			List<Category> categoryList = new ArrayList<Category>();
			conn = DBUtility.getConnection();
			pst = conn.prepareStatement("select * from category");
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				Category category = new Category();
				category.setCid(rs.getInt(1));
				category.setCcode(rs.getString(2));
				category.setCdescription(rs.getString(3));
				categoryList.add(category);
			}
			return categoryList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
}
