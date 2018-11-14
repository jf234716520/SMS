<%@ page language="java" contentType="text/html; charset=utf8"
    pageEncoding="utf8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf8">
<title>欢迎使用学员管理系统</title>
<script type="text/javascript" src="<%=request.getContextPath() %>/include/jquery/jquery-1.8.0.min.js" ></script>
</head>
<body>
账号<input id="userId" type="text" ><br/>
密码<input id="passwd" type="text" ><br/>
<input type="button" value="登录" onclick="login()">
<script>
function login(){
	var userId = $("#userId").val();
	var passwd = $("#passwd").val();
	window.location.href="login.do?userId="+userId+"&passwd="+passwd;
	
}

</script>
</body>
</html>