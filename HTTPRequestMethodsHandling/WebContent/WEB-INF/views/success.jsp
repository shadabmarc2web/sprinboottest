<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<style>
table, td, th {    
    border: 1px solid #ddd;
    text-align: left;
}

table {
    border-collapse: collapse;
    width: 100%;
}

th, td {
    padding: 15px;
}
</style>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
successful
<table>

name=<tr></td>${user.name}</td></tr>
age=<tr></td>${user.age}</td></tr>
email=<tr></td>${user.email}</td></tr>
city=<tr></td>${user.city}</td></tr>
<br><td><tr><a href="/HTTPRequestMethodsHandling">back</a></tr>
</table>

</body>
</html>