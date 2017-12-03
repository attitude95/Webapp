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
			<form name="productForm" action="addProduct" method="post">
				<table>
					<tr>
						<td>PRODUCT NAME</td>
						<td><input type="text" name="productName"></td>
					</tr>
					<tr>
						<td>ENTERPRISE_GSTN</td>
						<td><input type="text" name="enterpriseGstn"></td>
					</tr>
					<tr>
						<td>PRODUCT_PRICE</td>
						<td><input type="text" name="productPrice"></td>
					</tr>
					<tr>
						<td colspan=2><input type="submit" value="Add"></td>
					</tr>
				</table>
			</form>
			
		</h3>
	</center>
</body>
</html>