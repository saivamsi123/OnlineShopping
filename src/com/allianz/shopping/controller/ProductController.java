package com.allianz.shopping.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.allianz.shopping.dao.ProductDAO;
import com.allianz.shopping.dao.ProductDAOImpl;
import com.allianz.shopping.model.Product;
import com.utility.DateUtility;

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    static ProductDAO dao = new ProductDAOImpl();
    static Product product;
    static List<Product> productList;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductController() {
        super();
        System.out.println("ProductController....");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action!=null && action.equals("delete"))
		{
			String id = request.getParameter("id");
			boolean flag = dao.deleteProduct(Integer.parseInt(id));
			if(flag)
			{
				response.sendRedirect("ProductController");
			}
		}
		else if(action!=null && action.equals("edit"))
		{
			String id = request.getParameter("id");
			product = dao.getProductById(Integer.parseInt(id));
			if(product!=null)
			{
				RequestDispatcher rd = request.getRequestDispatcher("Product.jsp");
				request.setAttribute("product", product);
				rd.forward(request, response);
			}
		}
		
		else
		{
			productList = dao.getAllProducts();
			RequestDispatcher rd = request.getRequestDispatcher("ProductList.jsp");
			request.setAttribute("productList", productList);
			rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		
			String id = request.getParameter("id");
			String code = request.getParameter("code");
			String description = request.getParameter("description");
			String price = request.getParameter("price");
			String manfDate = request.getParameter("manufactureDate");
			Product product = new Product();
			product.setId(Integer.parseInt(id));
			product.setCode(code);
			product.setDescription(description);
			product.setPrice(Float.parseFloat(price));
			product.setMfgDate(DateUtility.connectStringToDate(manfDate));
			boolean flag = false;
			if(dao.getProductById(Integer.parseInt(id))!=null)
			{
				flag = dao.updateProduct(product);
				//response.sendRedirect("ProductController");
			}
			else
			{
				flag = dao.addProduct(product);
				
			}
			if(flag)
			{
				response.sendRedirect("ProductController");
			}
		}
			
		
}


