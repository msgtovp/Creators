<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
String user = request.getParameter("username");
String password = request.getParameter("password");
if(user == null || password == null) {
	response.sendRedirect("index.jsp");
}
Cookie ck = new Cookie("logged_user", user);
ck.setMaxAge(60*60);
response.addCookie(ck);
response.sendRedirect("success.jsp");
%>
</body>
</html>
