<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 7/5/2023
  Time: 10:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/edit" method="post">
  <input name="id" placeholder="nhập id" value="${student.id}" readonly><br>
  <input name="name" placeholder="nhập name" value="${student.name}"><br>
  <input name="email" placeholder="nhập ngày sinh" value="${student.email}"><br>
  <input name="dateofBrith" placeholder="nhập address" value="${student.dateofBirth}"><br>
  <input name="address" placeholder="nhập phone" value="${student.address}"><br>
  <input name="phoneNumber" placeholder="nhập name" value="${student.phone}"><br>
  <input name="classroom" placeholder="nhập classroom" value="${student.classroom}"><br>
  <button type="submit">Update</button>
</form>
</body>
</html>
