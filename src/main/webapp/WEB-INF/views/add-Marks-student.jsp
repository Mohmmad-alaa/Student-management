<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css"
	href="/student-management/res/css/my-style-sheet.css">
</head>
<body>
	<div class="container">
		<div class="form-group">
			<form:form action="saveMarksStudent?Id=0" method="GET" modelAttribute="mark">
				<br>
				<br>
				<h1>Add Mark</h1>
 
				<form:hidden path="idStudent" /> 
 
				<label for="n">C:</label>
				<br>
				<form:input id="n" path="c" class="form-control" placeholder="Enter mark c"/>
				<form:errors path="c" cssClass="error"/>
				<br>
				<label for="m">Java:</label>
				<br>
				<form:input id="m" path="java" class="form-control" placeholder="Enter mark java" />
				<form:errors path="java" cssClass="error"/>
				<br>
				<label for="c">Python:</label>
				<br>
				<form:input id="c" path="python" class="form-control" placeholder="Enter mark python"/>
				<form:errors path="python" cssClass="error"/>
				<br>
				
				<label for="b">Data structure :</label>
				<br>
				<form:input id="b" path="data_structure" class="form-control" placeholder="Enter mark data_structure"/>
				<form:errors path="data_structure" cssClass="error"/>
				<br>

			
				
			
				
				<input type="submit" value="Add" class="btn btn-primary">
				<br>

			</form:form>
		</div>
	</div>
</body>
</html>