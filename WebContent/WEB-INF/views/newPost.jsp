<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="newPost" method="post">
		<div class="form-field">
			<label>Title</label>
			<input type="text" name="title" value="Title"/>
		</div>
		<div class="form-field">
			<label>Description</label>
			<input type="text" name="description" value="Description"/>
		</div>
		<div class="form-submit">
			<input type="submit" value="submit" name="submit"/>
		</div>
	</form>

</body>
</html>