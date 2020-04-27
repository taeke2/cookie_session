<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login.jsp</title>
<script type="text/javascript">
	function popup() {
		if ("${cook}" == "")
			window.open("quiz_popup", "", "width=300,height=200,top=500,left=500");
	}
</script>
</head>
<body onload="popup()">
	<form method="post" action="quiz_chkUser">
		<input type="text" name="id" placeholder="아이디"><br>
		<input type="password" name="pwd" placeholder="비밀번호"><br>
		<input type="submit" value="로그인">
	</form>
</body>
</html>