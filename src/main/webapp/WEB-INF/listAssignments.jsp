<%--
  Created by IntelliJ IDEA.
  User: mrrobot
  Date: 2/7/25
  Time: 11:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Assignments List</title>
</head>
<body>
<table border="1">
    <caption>Assignments List</caption>
    <tr>
        <th>ID</th>
        <th>Shift</th>
    </tr>
    <c:forEach var="assignment" items="${assignments}">
        <tr>
            <td>${assignment.idAssignment}</td>
            <td>${assignment.shift}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
