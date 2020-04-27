<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>resultSession.jsp</title>
</head>
<body>
	<h3>세션 확인 페이지입니다.</h3>
	<hr>
	id : ${id }<br>
	age : ${age }<br>
	addr : ${addr }<hr>
	<a href="makeSession">makeSession 이동</a>
	<a href="delSession">delSession 이동</a>
</body>
</html>