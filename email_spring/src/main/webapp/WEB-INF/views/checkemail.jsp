<%--
  Created by IntelliJ IDEA.
  User: PhanAnhVu
  Date: 12/2/2019
  Time: 3:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Check Email</h1>
    <form action="docheck" method="post">
        <input type="text" name="email" id="email"> <%--</form><br>--%>
        <input type="submit" value="Submit">
    </form>
    <p>${message}</p>
</body>
</html>
