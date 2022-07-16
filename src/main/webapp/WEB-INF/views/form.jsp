<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/form" method="POST">
    Imię:<br>
    <input type="text" name="paramName"/><br>
    Data(yyyy-MM-yy):<br>
    <input type="text" name="paramDate"/><br>
    <input type="submit" value="Prześlij"/>
</form>
</body>
</html>
