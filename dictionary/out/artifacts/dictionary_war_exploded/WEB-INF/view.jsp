<%--
  Created by IntelliJ IDEA.
  User: PhanAnhVu
  Date: 11/22/2019
  Time: 2:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>dictionary</title>
</head>
<body>
<form action="/dictionary" method="get">
    <label>input word</label>
    <input type="text" name="key">
    <label>mean: </label>
    ${mean}
    <input type="submit">
</form>
</body>
</html>
