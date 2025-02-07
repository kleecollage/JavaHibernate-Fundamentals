<%--
  Created by IntelliJ IDEA.
  User: mrrobot
  Date: 2/7/25
  Time: 2:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Update Student</title>
</head>
<body>
<h1>Update Student</h1>
<form name="fomr1" action="${pageContext.request.contextPath}/ServletUpdate" method="post">
    Name: <input type="text" name="name" value="${student.name}"> <br />
    Surname: <input type="text" name="surname" value="${student.surname}">
    <br /> <br />
    Address Info: <br />
    Street Name: <input type="text" name="street" value="${student.address.street}"> <br />
    Street Number: <input type="text" name="noStreet" value="${student.address.noStreet}"> <br />
    Country: <input type="text" name="country" value="${student.address.country}">
    <br /> <br />
    Contact info: <br />
    Email: <input type="email" name="email" value="${student.contact.email}"> <br />
    Phone: <input type="tel" name="phone" value="${student.contact.phone}"> <br />

    <input type="submit" name="submit" value="Submit">
</form>
</body>
</html>
