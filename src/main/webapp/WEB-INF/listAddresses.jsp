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
    <title>Addresses List</title>
</head>
<body>
<table border="1">
    <caption>Addresses List</caption>
    <tr>
        <th>ID</th>
        <th>Street</th>
        <th>Street No.</th>
        <th>Country</th>
    </tr>
    <c:forEach var="address" items="${addresses}">
        <tr>
            <td>${address.idAddress}</td>
            <td>${address.street}</td>
            <td>${address.noStreet}</td>
            <td>${address.country}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
