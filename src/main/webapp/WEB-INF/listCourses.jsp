<%--
  Created by IntelliJ IDEA.
  User: mrrobot
  Date: 2/7/25
  Time: 11:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Courses List</title>
</head>
<body>
<table border="1">
    <caption>Courses List</caption>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Price</th>
    </tr>
    <c:forEach var="course" items="${courses}">
        <tr>
            <td>${course.idCourse}</td>
            <td>${course.name}</td>
            <td>${course.price}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
