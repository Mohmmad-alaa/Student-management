<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<body>
<br>
<br>
<br>
<br>
<div class="container">
	<a href="/student-management/"> <button type="button" class="btn btn-primary" >Back to home</button> </a>
	<br>
	<br>
	<br>
	<a href="addMarksStudent?Id=${mark.idStudent}" ><button type="submit" class="btn btn-primary"  >add</button></a>
	<br>
	<br>
	<table class="table table-striped">
			<thead>
				<tr>
				
					<td>C</td>
					<td>JAVA</td>
					<td>PYTHON</td>
					<td>Data Structure</td>
					<td>Total Score</td>
			
				</tr>
			</thead>
			<c:forEach items="${marks}" var="student">
				<tr>
					<td>${student.c}</td>
					<td>${student.java}</td>
					<td>${student.python}</td>
					<td>${student.data_structure}</td>
					<td>${student.totalScore}</td>
					<td></td>
					</tr>
			</c:forEach>
		</table>

	</div>
</body>
</html>