package com.allianz.shopping.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.allianz.shopping.dao.CustomerDAO;
import com.allianz.shopping.model.Customer;
import com.allianz.shopping.model.Product;
import com.database.dao.CustomerDAOImpl;
import com.utility.DateUtility;

/**
 * Servlet implementation class CustomerControllerDB
 */
@WebServlet("/CustomerControllerDB")
public class CustomerControllerDB extends HttpServlet {
	private static final long serialVersionUID = 1L;
    static CustomerDAO dao = new CustomerDAOImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerControllerDB() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String action = request.getParameter("action");
		if(action!=null && action.equals("login"))
		{
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			boolean flag = dao.login(username, password);
			if(flag)
			{
				HttpSession session = request.getSession();
				session.setAttribute("username", username);
				response.sendRedirect("index.jsp");
			} 
			else
			{
				response.sendRedirect("login.jsp");
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
		int id = Integer.parseInt(request.getParameter("id"));
		String username = request.getParameter("Username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String phoneno = request.getParameter("phoneNo");
		String landmark = request.getParameter("landmark");
		String address = request.getParameter("address");
		String pinno = request.getParameter("pinno");
		String city = request.getParameter("city");
		Customer customer = new Customer();
		customer.setCustomerId(id);
		customer.setCustomerName(username);
		customer.setPassword(password);
		customer.setEmail(email);
		customer.setPhoneNo(phoneno);
		customer.setLandmark(landmark);
		customer.setAddress(address);
		customer.setPinNo(pinno);
		customer.setCity(city);
		boolean isAdded = dao.addCustomers(customer);
		if(isAdded)
		{
//			response.sendRedirect("CustomerControllerDB");
//			PrintWriter out = response.getWriter();
//			response.setContentType("text/html");
			response.sendRedirect("login.jsp");
		}
	}

}
