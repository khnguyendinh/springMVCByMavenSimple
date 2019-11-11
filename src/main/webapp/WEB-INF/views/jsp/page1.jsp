<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC Redirect</title>
</head>
<body>
<h2>Page1</h2>
<form:form method="POST" action="redirect2">
    Name: <input type="text" name="name"><br/>
    <input type="submit" value="Redirect" />
</form:form>
</body>
</html>