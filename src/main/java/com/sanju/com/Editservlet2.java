package com.sanju.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Editservlet2
 */
@WebServlet("/Editservlet2")
public class Editservlet2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   doPost(request, response);
	}
@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       response.setContentType("text/html");
	       CustomersBo custbo = new CustomersBo();
            PrintWriter out = response.getWriter();
             int id = Integer.parseInt(request.getParameter("C_Id"));
             String Name = request.getParameter("C_Name");
//             String  password  = request.getParameter("Enter Password");
//             String  Confirmpass =request.getParameter("Enter Confirm Password");
             String C_email = request.getParameter("C_email");
             String  C_Address = request.getParameter("C_Address");
             String C_city = request.getParameter("C_city");
              Customers customer = new Customers(id, Name, C_email, C_Address, C_city);
                int upadteCust = custbo.upadteCust(customer);
        if( upadteCust > 0) {
        	out.println("<h2 style = 'color:red'>Updated Sucessfully</h2>");
        	  RequestDispatcher dispatcher= request.getRequestDispatcher("viewservlet");
              dispatcher.include(request, response);	
        }else {
        	out.println("<h2>Sorry!!! Deatils Not Updated....</h2>");
        }
	
out.close();
	
	}

}
