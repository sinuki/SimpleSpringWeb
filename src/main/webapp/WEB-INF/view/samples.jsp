<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Welcome</title>
</head> 
<body>
	<table>
		<tr>
			<th>NO</th>
			<th>TITLE</th>
			<th>DESCRIPTION</th>
		</tr>
		<c:forEach items="${samples }" var="item">
			<tr>
				<td>${item.no }</td>
				<td>${item.title }</td>
				<td>${item.description }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
