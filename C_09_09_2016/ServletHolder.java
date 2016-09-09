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
 * Servlet implementation class Holder
 */
@WebServlet("/View")
public class Holder extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Holder() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try(PrintWriter out = response.getWriter()) {
			out.println("<!doctype html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>App Holder</title>");
			out.println("<link rel=stylesheet href=theme.css>");
			out.println("</head>");
			out.println("<body>");
			out.println("<table class=\"view-contacts\">");
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/AddressBook","adb","secret");
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("select * from contact_info");
				out.println("<tr><th>Identity</th><th>Name</th><th>phonenumber</th><th>email</th><th>web</th></tr>");
				while(rs.next()) {
					out.println("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td><td>"+rs.getString(7)+"</td></tr>");
				}
			} catch(Exception e) { 
				out.println(e);
			}
			out.println("</table>");
			out.println("</body>");
			out.println("</html>");
			
		}
	}

}
