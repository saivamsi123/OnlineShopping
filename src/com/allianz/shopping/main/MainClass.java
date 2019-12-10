package com.allianz.shopping.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.allianz.shopping.model.Product;
import com.database.dao.ProductDatabaseDAOImpl;
import com.utility.DateUtility;

public class MainClass {
	static Scanner sc = new Scanner(System.in);
	static ProductDatabaseDAOImpl pro = new ProductDatabaseDAOImpl();
	public static void main(String[] args) 
	{
		//1. add
		//2. update
		//3. delete
		//4. select
		Product product = new Product();
		System.out.println("Enter the option: ");
		int option = sc.nextInt();
		System.out.println("Enter Id: ");
		int id = sc.nextInt();
		product.setId(id);
		System.out.println("Enter code: ");
		String code = sc.next();
		product.setCode(code);
		System.out.println("Enter description: ");
		String description = sc.next();
		product.setDescription(description);
		System.out.println("Enter price: ");
		float price = sc.nextFloat();
		product.setPrice(price);
		System.out.println("Enter date: ");
		String date = sc.next();
		Date date1 = DateUtility.connectStringToDate(date);
		product.setMfgDate(date1);
		switch (option) {
			case 1:
				boolean add = pro.addProduct(product);
				if(add)
				{
					System.out.println("Product added successfully");
				}
				else
				{
					System.out.println("Not added");
				}
				break;
			case 2:
				boolean update = pro.updateProduct(product);
				if(update)
				{
					System.out.println("Product updated successfully");
				}
				else
				{
					System.out.println("Product not updated");
				}
				break;
			default:
				System.out.println("Default case.......!");
		}
			
	}
}
