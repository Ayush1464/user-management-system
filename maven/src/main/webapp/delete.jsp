<%@page import="com.org.dto.User"%>
<%@page import="com.org.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<style>
body{
text-align:center;
}
</style>
<body>
<body>



	 <p>Are you sure you want to delete?</p>
	 
	 <form action="delete" method="post">
    <input type="hidden" name="userId" value="<%= request.getParameter("id") %>">
    <input type="submit" name="confirm" value="Yes">
    <button><a href="home.jsp">No</a></button>
	</form>
    
   
        
        
    
    </body>

</body>
</html>