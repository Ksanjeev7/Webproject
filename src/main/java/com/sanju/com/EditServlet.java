package com.sanju.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditServlet
 */
@WebServlet("/editservlet")
public class EditServlet extends HttpServlet {
 @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	        doPost(req, resp);
	 }
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     response.setContentType("text/html");
     CustomersBo customersbo = new CustomersBo();
     PrintWriter out = response.getWriter();
     out.println("<h2>Update Customers deatils...<h2>");
	  int id = Integer.parseInt(request.getParameter("C_Id"));
	   Customers custm = customersbo.getcust(id);
	   out.print("<form action='Editservlet2' method='post'>");  
       out.print("<table>");  
       out.print("<tr><td></td><td><input type='hidden' name='C_Id' value='"+custm.getC_Id()+"'/></td></tr>");  
       out.print("<tr><td>Name:</td><td><input type='text' name='C_Name' value='"+custm.getC_Name()+"'/></td></tr>");  
       out.print("<tr><td>Email:</td><td><input type='text' name='C_email' value='"+custm.getC_email()+"'/></td></tr>");   
       out.print("<tr><td>Address:</td><td><input type='text' name='C_Address' value='"+custm.getC_Address()+"'/></td></tr>");     
       out.print("<tr><td>City:</td><td><input type='text' name='C_city' value='"+custm.getC_city()+"'/></td></tr>");     
       out.print("<tr><td colspan='2'><input type='Submit' value='Edit & Save '/></td></tr>");  
       out.print("</table>");  
       out.print("</form>");     
	
	   out.close();
	
	}

}
