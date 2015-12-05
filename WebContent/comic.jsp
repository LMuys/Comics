<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<%@ page import="comic.*"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Marvel Comics</title>
<style>
table,th,td
{
border:1px solid black;
}
</style>
</head>
<body>
<h1><img src="logo.png" style="width: 20%; height: 20%"></h1>
<p>
	<table>
	<tbody>
	<tr><th>Comic ID</th><th>Comic Name</th><th>Main Character</th></tr>
	<c:forEach items="${listOfComics}" var="com">
	<tr>
	<td><c:out value="${com.comicId}"></c:out></td>
	<td><c:out value="${com.name}"></c:out></td>
	<td><c:out value="${com.hero}"></c:out></td>
	</tr>
	</c:forEach>
	</tbody>
	</table>
</p>

<form action="ComicServlet" method="post">
	<p>
		<label for="comic">What's the name of the comic?</label>
		<input id="comic" name="comic">
	</p>
	<p>
		<label for="comic">What's the name of the main character?</label>
		<input id="hero" name="hero">
	</p>
	<p>
		<input type="submit">
	</p>
</form>

</body>
</html>