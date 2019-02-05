<%@ page import="models.Post"%>
<%@ page import="java.util.List"%>
<%@ page import="models.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%  User user = (User) request.getAttribute("dbUser"); %>
<%  session.setAttribute("user", user); %>

<%  List<Post> listOfPosts = (List<Post>) request.getAttribute("listOfPosts"); %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<div class="container">
			<% if (listOfPosts != null) { %>
				<% for (int i = 0; i < listOfPosts.size(); i++) { %>
					<div class="post">
						<div class="post-title">
							<%= listOfPosts.get(i).getTitle() %>
						</div>
						<div class="post-description">
							<%= listOfPosts.get(i).getDescription() %>
						</div>
						
					</div>
				<% } %>
			<% } else { %>
				<h1>No posts yet it seems</h1>
			<% } %>
			
			<div class="floating-button">
				<a href="newPost"></a>
			</div>
			
			
		</div>
	</body>
</html>