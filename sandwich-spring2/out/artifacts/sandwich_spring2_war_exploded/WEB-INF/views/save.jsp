<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: PhanAnhVu
  Date: 11/25/2019
  Time: 11:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>sandwich</title>
</head>
<body>
<form action="save" method="post">
    <input type="checkbox" name="cond" value="gggg" checked hidden>
    lettuce <input type="checkbox" name="cond" value="lettuce">
    tomato <input type="checkbox" name="cond" value="tomato">
    <input type="submit" name="submit">

</form>
</body>
</html>
