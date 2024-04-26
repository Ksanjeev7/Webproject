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
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/deleteservlet")
public class DeleteServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request, response);
	}

@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     response.setContentType("text/html"); 
	PrintWriter out = response.getWriter();
	CustomersBo custbo = new CustomersBo();
	int id = Integer.parseInt(request.getParameter("C_Id"));
	int delete = custbo.delete(id);
                 if( delete > 0 ) {
                	 out.println("<h2>Deleted Successfully</h2>");
                	  RequestDispatcher dispatcher= request.getRequestDispatcher("viewservlet");
                      dispatcher.forward(request, response);          

                 }
                 else {
                	out.println("<h2> Not Deleted...<?h2>");
                 }
  out.close(); 
}

}
