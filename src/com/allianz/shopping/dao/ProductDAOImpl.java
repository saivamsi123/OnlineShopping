package com.allianz.shopping.dao;

import java.util.ArrayList;
import java.util.List;

import com.allianz.shopping.model.Product;
import com.utility.DateUtility;

public class ProductDAOImpl implements ProductDAO {

	private static List<Product> productList = new ArrayList<Product>();

	static {
		productList
				.add(new Product(104, "Colgate", "Colgate1", 100.00f, DateUtility.connectStringToDate("18/11/2019")));
		productList.add(new Product(100, "Dabur", "Dabur1", 1000.00f, DateUtility.connectStringToDate("19/11/2019")));
		productList.add(new Product(101, "Meswak", "Meswak1", 1023.00f, DateUtility.connectStringToDate("20/11/2019")));
		productList.add(new Product(102, "Red", "Red1", 1235.00f, DateUtility.connectStringToDate("21/11/2019")));
		productList
				.add(new Product(103, "Closeup", "Closeup1", 1200.00f, DateUtility.connectStringToDate("22/11/2019")));
	}

	@Override
	public boolean addProduct(Product product) {
		productList.add(product);
		return true;
	}

	@Override
	public boolean updateProduct(Product product) {
		if (productList != null && productList.size() > 0) {
			for (int i = 0; i < productList.size(); i++) {
				Product producttemp = productList.get(i);
				if (producttemp.getId() == product.getId()) {
					productList.set(i, product);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean deleteProduct(int id) {
		if (productList != null && productList.size() > 0) {
			for (int i = 0; i < productList.size(); i++) {
				Product producttemp = productList.get(i);
				if (producttemp.getId() == id) {
					productList.remove(i);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public List<Product> getAllProducts() {
		return productList;
	}

	@Override
	public List<Product> getAllProductsByName(String name) {
		List<Product> productList = new ArrayList<Product>();
		if (productList != null && productList.size() > 0) {
			for (int i = 0; i < productList.size(); i++) {
				Product producttemp = productList.get(i);
				if (producttemp.getDescription().toLowerCase().contains(name.toLowerCase())) {
					productList.add(producttemp);
				}
			}
			return productList;
		}
		return null;
	}

	@Override
	public List<Product> getAllProductsByPrice(float max, float min) {
		List<Product> productList = new ArrayList<Product>();
		if (productList != null && productList.size() > 0) {
			for (int i = 0; i < productList.size(); i++) {
				Product producttemp = productList.get(i);
				if (producttemp.getPrice() >= min && producttemp.getPrice() <= max) {
					productList.add(producttemp);
				}
			}
			return productList;
		}
		return null;
	}

	@Override
	public Product getProductById(int id) {
		if (productList != null && productList.size() > 0) {
			for (int i = 0; i < productList.size(); i++) {
				Product producttemp = productList.get(i);
				if (producttemp.getId() == id) {
					return producttemp;
				}
			}
		}
		return null;
	}

	@Override
	public List<Product> getAllProductsByCategoryId(int id) {
		return null;
	}

}
