package com.addressbook.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertServlet
 */
@WebServlet("/insertuser")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try(PrintWriter out = response.getWriter()) {
			String user = request.getParameter("username");
			try {
				response.setContentType("text/html");
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","JustPass");
				Statement stmt = conn.createStatement();
				int count = stmt.executeUpdate("delete from login_users where user = '"+user+"'");
				if(count > 0) {
					out.println("Delted");
					out.println("<a href=index.html>Do More</a>");
				} else {
					response.sendRedirect("index.html");
				}
			} catch(Exception e) { 
				out.println(e);
			}
		}
	}
   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

}
