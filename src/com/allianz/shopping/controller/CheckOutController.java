package com.allianz.shopping.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.allianz.shopping.dao.AddToCartDAO;
import com.allianz.shopping.dao.CategoryDAO;
import com.allianz.shopping.dao.OrderDAO;
import com.allianz.shopping.model.AddToCart;
import com.allianz.shopping.model.Category;
import com.allianz.shopping.model.Order;
import com.allianz.shopping.model.Product;
import com.database.dao.AddToCartDAOImpl;
import com.database.dao.CategoryDAOImpl;
import com.database.dao.OrderDAOImpl;
import com.database.dao.ProductDatabaseDAOImpl;
import com.utility.DateUtility;

/**
 * Servlet implementation class CheckOutController
 */
@WebServlet("/CheckOutController")
public class CheckOutController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	static OrderDAO orderDao = new OrderDAOImpl();
	static AddToCartDAO addToCartDao = new AddToCartDAOImpl();
	static ProductDatabaseDAOImpl dao = new ProductDatabaseDAOImpl();
	static CategoryDAO daoCat = new CategoryDAOImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckOutController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter out = response.getWriter();
//		response.setContentType("text/html");
		String action = request.getParameter("action");
		String username = (String) request.getSession().getAttribute("username");
		if(action!=null && action.equals("showOrders"))
		{
			List<Order> orderList = orderDao.getAllOrders();
			if(orderList!=null)
			{
				RequestDispatcher rd = request.getRequestDispatcher("showOrders.jsp");
				request.setAttribute("orderList", orderList);
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
		
		String username = (String) request.getSession().getAttribute("username");
		String productId[] = request.getParameterValues("productId");
		
		if(productId != null && productId.length>0)
		{
			float grandTotal = 0;
			for(int i = 0;i<productId.length;i++)
			{
				String total = request.getParameter("total"+productId[i]);
				grandTotal = grandTotal + Float.parseFloat(total);
			}
			Order order = new Order();
			order.setOrderDate(DateUtility.convertUtiltoSql(new Date()));
			order.setStatus("ordered");
			order.setUsername(username);
			order.setTotalPrice(grandTotal);
			
			int orderId = orderDao.addOrder(order);
			
			for(int i=0;i<productId.length;i++)
			{
				if(productId[i]!=null && !productId[i].trim().equals(""))
				{
					String quantity = request.getParameter("quantity"+productId[i]);
					String total = request.getParameter("total"+productId[i]);
					AddToCart addToCart = new AddToCart();
					addToCart.setOrder_id(orderId);
					addToCart.setQuantity(Integer.parseInt(quantity));
					addToCart.setProduct_id(Integer.parseInt(productId[i]));
					addToCart.setTotal(Float.parseFloat(total));
					addToCartDao.addToCart(addToCart);
				}
			}
		}
		response.sendRedirect("CheckOutController");
	}

}
