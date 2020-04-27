<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>popup.jsp</title>
<script type="text/javascript">
	function chk(){
		location.href = "quiz_cookieChk";
		window.close();
	}
</script>
</head>
<body>
	<h1>쿠키를 위한 팝업창입니다.</h1>
	<input type="checkbox" onclick="chk()">오늘 하루 보지 않기
</body>
</html>