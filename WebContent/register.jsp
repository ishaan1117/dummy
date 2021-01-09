<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="RegistrationController" method="post">
<table>
	<tr><td >CustomerID</td><td><input type="text" name="custid"></td></tr>

<tr><td> Customer Name</td><td><input type="text" name="custname"></td></tr>
<tr><td> Customer Age</td><td><input type="text" name="custage"></td></tr> 
<tr><td>Mobile No</td><td><input type="text" name="mobile"></td></tr>
<tr><td>City</td><td>
				<select name="city">
						<option value="Chennai">Chennai</option>
						<option value="Mumbai">Mumbai</option>
						<option value="Delhi">Delhi</option>
						
				</select>
				</td></tr>
				<tr><td></td><td><input type="submit" value="Register"></td></tr>

</table>

</form>

</body>
</html>