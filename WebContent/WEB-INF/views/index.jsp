<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Blog It</title>
	</head>
	<body>
		<div class="container">
			<jsp:include page="../components/__logIn.jsp"></jsp:include>
			<a href="<jsp:forward page="newUser.jsp"/>">Create an Account</a>
		</div>		
	</body>
</html>