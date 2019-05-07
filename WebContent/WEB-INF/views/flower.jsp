<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register Form</title>

</head>
<body>
	<form:form name="registerForm" method="POST" action="register">
		<div align="center">
			<table>
				<tr>
					<td>Flower Name</td>
					<td><input type="text" name="flowerName" /></td>
				</tr>
				<tr>
					<td>Type</td>
					<td><select name="type">
							<option value="">--Choose Type--</option>
							<option value="Rare" >Rare</option>
							<option value="Common">Common</option>
							<option value="Hybrid">Hybrid</option>
					</select></td>
				</tr>
				<tr>
					<td>Colour</td>
					<td><input type="text" name="Colour" /></td>
				</tr>
				<tr>
					<td>Cost</td>
					<td><input type="number" name="cost" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Register" /></td>
					<td><input type="submit" value="Show"
						onclick="document.registerForm.action='show'" /></td>
					<td><input type="submit" value="Modify"
						onclick="document.registerForm.action='fetch'" /></td>
				</tr>
			</table>
			<div style="color: red">${msg}</div>
		</div>
	</form:form>
</body>
</html>