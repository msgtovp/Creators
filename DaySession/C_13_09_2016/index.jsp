
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! String user = ""; %>
<%
boolean isLogged = false;
Cookie cks[] = request.getCookies();
for(int i = 0; i < cks.length; i++) {
	if(cks[i].getName().equals("logged_user")) {
		isLogged = true;
		user = cks[i].getValue();
		break;
	}
}
if(!isLogged) { 
%>
	<form action="login.jsp" method="post">
	<input type="text" name="username"  placeholder="Username Here" />
	<input type="password" name="password"  placeholder="Password Here" />
	<input type="submit" value="login" />
	</form>
<% } else { %>
	<div>Welcome <%= user %></div>
<% } %>
</body>
</html>
