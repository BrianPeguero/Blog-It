<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<form:form action="signUp" method="post" modelAttribute="SignInUser">
	<div class="form-field">
		<label>Email: </label>
		<form:input type="email" name="email" path="email"/>
		<form:error path="email" cssClass="error"/>
	</div>
	<div class="form-field">
		<label>Password: </label>
		<form:input type="password" name="password" path="password"/>
		<form:error path="password" cssClass="error"/>
	</div>
	<div class="form-field">
		<input type="submit" name="submit" >
	</div>
</form:form>