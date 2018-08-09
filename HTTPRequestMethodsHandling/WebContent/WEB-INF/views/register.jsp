<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/HTTPRequestMethodsHandling/success" method="post">
name:<input type="text" name="name"><br>
age:<input type="text" name="age"><br>
email:<input type="text" name="email"><br>
city:<input type="text" name="city"><br>
<input type="submit" ><br>

</form>
<h3>${userdata}</h3>
</body>
</html>