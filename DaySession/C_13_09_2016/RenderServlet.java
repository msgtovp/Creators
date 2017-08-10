package com.creators.users;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.creators.users.java.UserTbl;
import com.google.gson.Gson;
/**
 * Servlet implementation class RenderServlet
 */
@WebServlet(
		urlPatterns = { "/render" }, 
		initParams = { 
				@WebInitParam(name = "option", value = "view")
		})
public class RenderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RenderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try(PrintWriter out = response.getWriter()) {
			response.setContentType("application/json");
			try {
				List<UserTbl> li = new LinkedList<UserTbl>();
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Account","root","JustPass");
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("select * from tbl_users");
				while(rs.next()) {
					li.add(new UserTbl(rs.getInt(1),rs.getString(2),rs.getString(3)));
				}
				out.println(new Gson().toJson(li));
			} catch(Exception e) { 
				out.println(e);
			}
		}
	}
}
