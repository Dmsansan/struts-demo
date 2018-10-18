<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="demo/user.action" method="post">
		<p>
			用户名:<input type="text" name="userValue.name"/>
		</p>
		<p>
			年龄:<input type="text" name="userValue.age"/>
		</p>
		<p>
			用户密码:<input type="password" name="userValue.password"/>
		</p>
		<p>
			<input type="submit" value="提交用户数据"/>
		</p>
	</form>
	
</body>
</html>