<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%--
  Created by IntelliJ IDEA.
  User: PhanAnhVu
  Date: 11/25/2019
  Time: 4:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>show</title>
</head>
<body>
   <c:if test="${cond[1] !=null}">
       ${cond[1]}
   </c:if>
   <c:if test="${cond[2] !=null}">
       ${cond[2]}
   </c:if>
</body>
</html>
