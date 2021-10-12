<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="/student-management/res/css/my-style-sheet.css">


</head>
<body>
	<br>
	<br>
	<div align="left" class="container">
		<h1>Students</h1>
		
		<form:form action="add" method="GET" modelAttribute="students">
			<input type="submit" value="add" class="btn btn-primary" >
		</form:form>
		
	<br>
		<form action="/student-management/">
			<input type="submit" class="btn btn-primary" value="Display all">
		</form>
		<form action="searchStudent">
			<div class="form-row align-items-center">
				<div class="col-sm-3 my-1">
					<label class="sr-only" for="inlineFormInputName">search</label> 
					<input
						type="search" class="form-control" id="inlineFormInputName"
						placeholder="Enter the name to search" name="name" >
				</div>
				
				<div class="col-auto my-1">
					<button type="submit" class="btn btn-primary">Search</button>
				</div>
			</div>
		</form>

		<br>
		<table class="table table-striped">
			<thead>
				<tr>
					<td>ID</td>
					<td>NAME</td>
					<td>MOBILE</td>
					<td>COUNTRY</td>
					<td>UPDATE</td>
					<td>DELETE</td>
				</tr>
			</thead>
			<c:forEach var="student" items="${searchList}">
				<tr>
					<td>${student.id}</td>
					<td>${student.name}</td>
					<td>${student.mobile}</td>
					<td>${student.country}</td>
					<td><a href="updateStudent?Id=${student.id}">Update</a></td>
					<td><a href="delete-Student?Id=${student.id}"
						onclick="if(!(confirm('Are you sure you want to delete this student?'))) return false">Delete</a></td>
				</tr>
			</c:forEach>
		</table>

	</div>

</body>
</html>