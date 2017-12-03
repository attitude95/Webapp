<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product List</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

</head>
<body>
<table border=2>
<tr>
<th>NAME</th>
<th>ENTERPRISEGSTN</th>
<th>PRICE</th>
</tr>
<c:forEach items="${list }" var="product">
<tr>
<td>${product.getProductName() }</td>
<td>${product.getEnterpriseGstn() }</td>
<td>${product.getProductPrice() }</td>
</tr>
</c:forEach>
</table>
</body>
</html>