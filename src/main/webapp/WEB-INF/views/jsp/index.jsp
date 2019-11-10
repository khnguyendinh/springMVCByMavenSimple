<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
</head>
<body>
	<h1>Spring MVC Hello World!</h1>
	<a href="hello">hello</a>
	<h2>home.jsp</h2>
	<a href="home">/home</a> <br/>
	<a href="test">/test (GET)</a> <br/>
	<form method="post" action="test">
		<button type="submit">/test (POST)</button>
	</form>

	<%--request param--%>
	<a href="test1/1">/test1/1</a>
	<br />
	<a href="test2/2/kai">/test2/2/kai</a>
	<br />
	<fieldset>
		<legend>/test3?id=&name=</legend>
		<form action="test3">
			Id: <input type="number" name="id" /> <br />
			Name: <input type="text" name="name" /> <br />
			<input type="submit" value="submit" />
		</form>
	</fieldset>
</body>
</html>