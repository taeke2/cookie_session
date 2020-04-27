<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main.jsp</title>
</head>
<body>
	<c:choose>
		<c:when test="${loginUser } == null">
			<script>location.href = "quiz"</script>
		</c:when>
		<c:otherwise>
			${loginUser }님 안녕하세요<br>만나서 반갑습니다.<br>
			<a href="quiz_logout">로그아웃</a>
			<a href="quiz">로그인</a>
		</c:otherwise>
	</c:choose>
</body>
</html>