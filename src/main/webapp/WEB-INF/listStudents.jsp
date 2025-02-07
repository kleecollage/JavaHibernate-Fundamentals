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
    <title>Students List</title>
</head>
<body>
<table border="1">
  <caption>Students List</caption>
  <tr>
    <th>ID</th>
    <th>Name</th>
    <th>Surname</th>
  </tr>
  <c:forEach var="student" items="${students}">
    <tr>
      <td>${student.idStudent}</td>
      <td>${student.name}</td>
      <td>${student.surname}</td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
