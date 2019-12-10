package com.allianz.shopping.dao;

import java.util.List;

import com.allianz.shopping.model.Category;

public interface CategoryDAO {
	public boolean addCategory(Category category);
	public boolean updateCategory(Category category);
	public boolean deleteCategory(int id);
	public List<Category> getAllCategoriesByProductId(int id);
	public Category getCategoryById(int id);
	public List<Category> getAllCategories();
	public List<Category> getCategoryByName(String cname);
}
