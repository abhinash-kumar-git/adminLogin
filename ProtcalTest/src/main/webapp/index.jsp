<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>form register</title>
</head>
<body>
<div class="container"></div>
<h1>my From</h1>
<form action="RegisterServlet" method="post">
<table>
<tr>
<td>Enter please here</td>
<td><input type="text" name="user_name" placeholder="enter here name"></td>
</tr>
<tr>
<td>Enter your email</td>
<td><input type="text" name="user_email" placeholder="enter here email"></td>
</tr>
<tr>
<td>Enter please password</td>
<td><input type="text" name="user_password" placeholder="enter here password"></td>
</tr>
<tr>
<td>Enter please mobile number</td>
<td><input type="text" name="user_phone" placeholder="enter here phone"></td>
</tr>

<tr>
<td>  <input type="radio" name="username" value="male">MALE &nbsp; &nbsp;<input type="radio" name="username" value="FEMALE">FEMALE &nbsp; &nbsp;
<input type="radio" name="username" value="OTHER">OTHER &nbsp; &nbsp; </td>
</tr>

<tr>
<td>
<select name="course">
<option value="java">java</option>
<option value="C">C</option>
<option value="python">python</option>
<option value="HTML">HTML</option>
<option value="Math">Math</option>
</select>
</td>
</tr>
<tr>
<td>
<input type="checkbox" value="checked" name="condition" />
</td>
<td> agree terms and condition </td>

</tr>

</table>
<button type="submit">submit</button>
<button type="reset">reset</button>

</form>


<a href="we">click here</a><br>
<a href="web">secondservlet</a><br>
<a href="webs">myservlrt file</a>
</body>
</html>