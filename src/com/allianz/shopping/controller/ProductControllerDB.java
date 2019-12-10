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

import com.allianz.shopping.dao.CategoryDAO;
import com.allianz.shopping.dao.ProductDAO;
import com.allianz.shopping.dao.ProductDAOImpl;
import com.allianz.shopping.model.Category;
import com.allianz.shopping.model.Product;
import com.database.dao.CategoryDAOImpl;
import com.database.dao.ProductDatabaseDAOImpl;
import com.utility.DateUtility;

import sun.misc.Cache;

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/ProductControllerDB")
public class ProductControllerDB extends HttpServlet {
	private static final long serialVersionUID = 1L;
    static ProductDatabaseDAOImpl dao = new ProductDatabaseDAOImpl();
    static CategoryDAO daoCat = new CategoryDAOImpl();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductControllerDB() {
        super();
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
				response.sendRedirect("ProductControllerDB");
			}
		}
		else if(action!=null && action.equals("edit"))
		{
			String id = request.getParameter("id");
			Product product = dao.getProductById(Integer.parseInt(id));
			if(product!=null)
			{
				RequestDispatcher rd = request.getRequestDispatcher("Product.jsp");
				request.setAttribute("product", product);
				rd.forward(request, response);
			}
		}
		else if(action!=null && action.equals("getAllProductsByCategoryId"))
		{
			String category_id = request.getParameter("category_id");
			List<Product> productList = dao.getAllProductsByCategoryId(Integer.parseInt(category_id));
			List<Category> categoryList = daoCat.getAllCategories();
			if(productList!=null && categoryList!=null)
			{
				RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
				request.setAttribute("productList", productList);
				request.setAttribute("categoryList", categoryList);
				rd.forward(request, response);
			}
		}
		else if(action!=null && action.equals("getProductById"))
		{
			String product_id = request.getParameter("product_id");
		    Product product = dao.getProductById(Integer.parseInt(product_id));
			if(product!=null)
			{
				RequestDispatcher rd = request.getRequestDispatcher("productDetails.jsp");
				request.setAttribute("product", product);
				rd.forward(request, response);
			}
		}
		else if(action!=null && action.equals("addToCart"))
		{
			String product_id = request.getParameter("product_id");
		    Product product = dao.getProductById(Integer.parseInt(product_id));
		    boolean flag = false;
			if(product!=null)
			{
				List<Product> productList = new ArrayList<Product>();
				if(request.getSession().getAttribute("productList")!=null)
				{
					productList = (List<Product>)request.getSession().getAttribute("productList");
					for(int i=0;i<productList.size();i++)
					{
						if(productList.get(i).getId() == (Integer.parseInt(product_id)))
						{
							flag = true;
						}
					}
					if(!flag)
					{
						productList.add(product);
						request.getSession().setAttribute("productList", productList);
					}
				}
				else
				{
					productList.add(product);
					request.getSession().setAttribute("productList", productList);
				}
				RequestDispatcher rd = request.getRequestDispatcher("addToCart.jsp");
				request.setAttribute("productList", productList);
				rd.forward(request, response);
			}
		}
		else if(action!=null && action.equals("deletecart"))
		{
			String index = request.getParameter("index");
			List<Product> productList = new ArrayList<Product>();
			if(request.getSession().getAttribute("productList")!=null)
			{
				productList = (List<Product>)request.getSession().getAttribute("productList");
				productList.remove(Integer.parseInt(index));
				request.getSession().setAttribute("productList", productList);
			}
			RequestDispatcher rd = request.getRequestDispatcher("addToCart.jsp");
			request.setAttribute("productList", productList);
			rd.forward(request, response);
			
		}
		else if(action!=null && action.equals("editcart"))
		{
			String id = request.getParameter("id");
			Product product = dao.getProductById(Integer.parseInt(id));
			if(product!=null)
			{
				RequestDispatcher rd = request.getRequestDispatcher("Product.jsp");
				request.setAttribute("product", product);
				rd.forward(request, response);
			}
		}
		else
		{
			List<Product> productList = dao.getAllProducts();
			List<Category> categoryList = daoCat.getAllCategories();
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			request.setAttribute("productList", productList);
			request.setAttribute("categoryList", categoryList);
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


