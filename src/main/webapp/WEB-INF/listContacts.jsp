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
    <title>Contacts List</title>
</head>
<body>
<table border="1">
  <caption>Contacts List</caption>
  <tr>
    <th>ID</th>
    <th>Phone</th>
    <th>Email</th>
  </tr>
  <c:forEach var="contact" items="${contacts}">
    <tr>
      <td>${contact.idContact}</td>
      <td>${contact.phone}</td>
      <td>${contact.email}</td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
