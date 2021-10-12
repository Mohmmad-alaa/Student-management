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
			<form:form action="save-update-Student" method="POST" modelAttribute="student">
				<br>
				<br>
				<h1>Add Student</h1>

				<form:hidden path="id" />

				<label for="n">Name:</label>
				<br>
				<form:input id="n" path="name" class="form-control" placeholder="Enter name"/>
				<form:errors path="name" cssClass="error"/>
				<br>
				<label for="m">Mobile:</label>
				<br>
				<form:input id="m" path="mobile" class="form-control" placeholder="Enter mobile" />
				<form:errors path="mobile" cssClass="error"/>
				<br>
				<label for="c">Country:</label>
				<br>
				<form:input id="c" path="country" class="form-control" placeholder="Enter country"/>
				<form:errors path="country" cssClass="error"/>
				<br>
				
				<label for="b">Blood group:</label>
				<br>
				<form:input id="b" path="blood_group" class="form-control" placeholder="Enter blood_group"/>
				<form:errors path="blood_group" cssClass="error"/>
				<br>

				<label for="d">DOB:</label>
				<br>
				<form:input id="d" path="dob" class="form-control" placeholder="Enter date of birth"/>
				<form:errors path="dob" cssClass="error"/>
				<br>

				
					<label>Gender : </label> Male
					<form:radiobutton path="gender" value="male" />
					Female
					<form:radiobutton path="gender" value="female" />
					<br>
				
				<input type="submit" value="Add" class="btn btn-primary">
				<br>

			</form:form>
		</div>
	</div>
</body>
</html>