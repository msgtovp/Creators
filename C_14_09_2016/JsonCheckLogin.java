package com.creators;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class JsonCheckLogin
 */
@WebServlet("/checklogin")
public class JsonCheckLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JsonCheckLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try(PrintWriter out = response.getWriter()) {
			String user = request.getParameter("username");
			String pass = request.getParameter("password");
			response.setContentType("application/json");
			Map<String, String> mp = new TreeMap<String,String>();
			if(user == null || pass == null || user.equals("") || pass.equals("")) {
				mp.put("message", "Query Error");
			} else {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/account","root","JustPass");
					PreparedStatement ps = conn.prepareStatement("select * from login_users where username=? and password=?");
					ps.setString(1, user);
					ps.setString(2, pass);
					ResultSet rs = ps.executeQuery();
					if(rs.next()) {
						mp.put("message", "Login Success");
					} else {
						mp.put("message", "Login Error");
					}
				} catch(Exception e) { 
					mp.put("message", "Database Error");
				}
			}
			out.println(new Gson().toJson(mp));
		}

	}

}
