<%--
  Created by IntelliJ IDEA.
  User: PhanAnhVu
  Date: 11/22/2019
  Time: 2:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>usd-vnd</title>
</head>
<body>
  <form action="/converter" method="get">
      <label>usd</label><input type="text" name="usd">
      <label>vnd</label>${vnd}
      <input type="submit" >
  </form>
</body>
</html>
