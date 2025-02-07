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
    <th>Address</th>
    <th>Email</th>
    <th>Phone</th>
  </tr>
  <c:forEach var="student" items="${students}">
    <tr>
      <td>
        <a href="${pageContext.request.contextPath}/ServletUpdate?idStudent=${student.idStudent}">
          ${student.idStudent}
        </a>
      </td>
      <td>${student.name} ${student.surname}</td>
      <td>${student.address.street} ${student.address.noStreet} ${student.address.country}</td>
      <td>${student.contact.email}</td>
      <td>${student.contact.phone }</td>
    </tr>
  </c:forEach>
</table>
<h4>New Student? Click the link bellow</h4>
<a href="${pageContext.request.contextPath}/ServletRedirect">Add Student</a> <br />
</body>
</html>
