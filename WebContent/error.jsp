<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

			
		<font  style="color:red">
		<h2> Registration Failed!!!</h2><br>
		<b>Reason : <%= request.getAttribute("errorReason") %></b>
		</font>
			
</body>
</html>