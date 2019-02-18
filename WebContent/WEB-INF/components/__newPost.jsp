<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<form:form action="logIn" method="post" modelAttribute="SignInUser">
	<div class="form-field">
		<label>Title: </label>
		<form:input type="title" name="title" path="title"/>
		<form:error path="title" cssClass="error"/>
	</div>
	<div class="form-field">
		<label>Description: </label>
		<form:input type="description" name="description" path="description"/>
		<form:error path="description" cssClass="error"/>
	</div>
	<div class="form-field">
		<input type="submit" name="submit" >
	</div>
</form:form>