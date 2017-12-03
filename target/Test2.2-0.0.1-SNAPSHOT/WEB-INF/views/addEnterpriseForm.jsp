<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<center>
		<h3>
		<a href="hello?name=Chandu">Click Here</a>
			<form name="enterpriseForm" action="addEnterprise" method="post">
				<table>
					<tr>
						<td>GSTN</td>
						<td><input type="text" name="gstn"></td>
					</tr>
					<tr>
						<td>ENTERPRISE_NAME</td>
						<td><input type="text" name="enterpriseName"></td>
					</tr>
					<tr>
						<td>SPOKE</td>
						<td><input type="text" name="spoke"></td>
					</tr>
					<tr>
						<td>ADDRESS</td>
						<td><input type="text" name="address"></td>
					</tr>
					<tr>
						<td>PHONE</td>
						<td><input type="text" name="phone"></td>
					</tr>
					<tr>
						<td>EMAIL_ID</td>
						<td><input type="text" name="emailId"></td>
					</tr>
					<tr>
						<td colspan=2><input type="submit" value="Login"></td>
					</tr>
				</table>
			</form>
			
		</h3>
	</center></body>
</html>

</body>
</html>