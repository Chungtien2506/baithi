<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 7/5/2023
  Time: 9:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Form Create</h1>
<form action="/createStudent" method="post">
<%--    <input name="id" placeholder="nhập id" ><br>--%>
    <input name="name" placeholder="nhập name" ><br>
    <input name="email" placeholder="nhập email" ><br>
    <input name="DateofBirth" placeholder="nhập ngay sinh" ><br>
    <input name="address" placeholder="nhập andress" ><br>
    <input name="phoneNumber" placeholder="nhập phone" ><br>
    <input name="classroom" placeholder="nhập classroom" ><br>
    <button type="submit">Create</button>
</form>
</body>
</html>
