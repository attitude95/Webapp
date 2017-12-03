<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enterprise List</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

</head>
<body>
<table border=2>
<tr>
<th>GSTN</th>
<th>NAME</th>
<th>SPOKE</th>
<th>ADDRESS</th>
<th>PHONE</th>
<th>EMAILID</th>
</tr>
<c:forEach items="${list }" var="enterprise">
<tr>
<td>${enterprise.getGstn() }</td>
<td>${enterprise.getEnterpriseName() }</td>
<td>${enterprise.getSpoke() }
<td>${enterprise.getAddress() }</td>
<td>${enterprise.getPhone() }</td>
<td>${enterprise.getEmailId() }</td>
</tr>
</c:forEach>
</table>
</body>
</html>