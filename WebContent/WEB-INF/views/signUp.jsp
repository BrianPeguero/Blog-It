<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%  String message = (String) request.getParameter("message"); %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<div class="container">
			<%  if (message != null || message != ""){ %>
				<%= message %>
			<% } %>
			<jsp:include page="../components/__signUp.jsp"/>
		</div>
	</body>
</html>