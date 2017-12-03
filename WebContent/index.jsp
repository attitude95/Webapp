<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Hello World !!</h1>
	<center>
		<h2>Hello World</h2>
		<h3>
			<a href="hello?name=Chandu">Click Here</a>
			<form name="loginDetails" action="validate" method="post">
				<table>
					<tr>
						<td>Username</td>
						<td><input type="text" name="username"></td>
					</tr>
					<tr>
						<td>Password</td>
						<td><input type="password" name="password"></td>
					</tr>
					<tr>
						<td colspan=2><input type="submit" value="Login"></td>
					</tr>
				</table>
			</form>
						<a href="addEnterpriseForm">Add Enterprise</a>
			
		</h3>
	</center></body>
</html>