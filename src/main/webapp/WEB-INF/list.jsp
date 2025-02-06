<%--
  Created by IntelliJ IDEA.
  User: mrrobot
  Date: 2/5/25
  Time: 7:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>People List</title>
</head>
<body>
<table border="1">
    <caption>People List</caption>
    <tr>
        <th>Id Person</th>
        <th>Name</th>
        <th>Surname</th>
        <th>Email</th>
        <th>Phone</th>
    </tr>
    <c:forEach var="person" items="${persons}">
        <tr>
            <td>${person.idPerson}</td>
            <td>${person.name}</td>
            <td>${person.surname}</td>
            <td>${person.email}</td>
            <td>${person.phone}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>











