<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"  %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Insert title here</title>
</head>
<body>
	<table border="2">
		<tr>
			<th>ID</th>
			<th>CODE</th>
			<th>DESCRIPTION</th>
			<th>PRICE</th>
			<th>MANUFACTURING DATE</th>
			<th>ADD</th>
			<th>EDIT</th>
			<th>DELETE</th>
		</tr>
	
	<c:forEach items="${productList}" var="products">
		<tr>
			<td><c:out value="${products.id}"></c:out></td>
			<td><c:out value="${products.code}"></c:out></td>
			<td><c:out value="${products.description}"></c:out></td>
			<td><c:out value="${products.price}"></c:out></td>
			<td>
				<fmt:formatDate value="${products.mfgDate}" pattern = "dd/MM/yyyy"/>
			</td>
			<td><a href="ProductControllerDB?action=add">Add</a></td>
			<td><a href="ProductControllerDB?action=edit&id=${products.id}">Edit</a></td>
			<td><a href="ProductControllerDB?action=delete&id=${products.id}">Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>