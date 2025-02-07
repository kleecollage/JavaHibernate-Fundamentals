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
    <title>Add Student</title>
</head>
<body>
<h1>Add Student</h1>
<form name="fomr1" action="${pageContext.request.contextPath}/ServletAdd" method="post">
    Name: <input type="text" name="name"> <br />
    Surname: <input type="text" name="surname">
    <br /> <br />
    Address Info: <br />
    Street Name: <input type="text" name="street"> <br />
    Street Number: <input type="text" name="noStreet"> <br />
    Country: <input type="text" name="country" >
    <br /> <br />
    Contact info: <br />
    Email: <input type="email" name="email"> <br />
    Phone: <input type="tel" name="phone"> <br />

    <input type="submit" name="submit" value="Submit">
</form>
</body>
</html>
