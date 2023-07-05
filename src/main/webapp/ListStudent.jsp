<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 7/5/2023
  Time: 9:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container mt-3">
  <nav class="navbar navbar-expand-sm navbar-dark">
    <div class="container-fluid">
      <a href="/createStudent" class="btn btn-primary">Add</a>
      <div class="collapse navbar-collapse" id="mynavbar">
<%--        <ul class="navbar-nav me-auto">--%>
<%--          <li class="nav-item">--%>
<%--          </li>--%>
<%--          <li class="nav-item">--%>
<%--          </li>--%>
<%--          <li class="nav-item">--%>
<%--          </li>--%>
<%--        </ul>--%>
        <form action="/search" method="get" class="d-flex">
          <input class="form-control me-2" type="text" name="stringSearch" placeholder="Search">
          <button class="btn btn-primary" type="submit">Search</button>
        </form>
      </div>
    </div>
  </nav>
  <table class="table table-striped">
    <thead>
    <tr>
      <th>#</th>
      <th>Name</th>
      <th>Email</th>
      <th>Date of birth</th>
      <th>Address</th>
      <th>Phone</th>
      <th>Edit</th>
      <th>Delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${students}" var="s">
      <tr>
        <td>${s.id}</td>
        <td>${s.name}</td>
        <td>${s.email}</td>
        <td>${s.dateofBirth}</td>
        <td>${s.address}</td>
        <td>${s.phoneNumber}</td>
        <td><a href="/edit?id=${s.id}" class="btn btn-info">Edit</a></td>
        <td><a href="/delete?id=${s.id}" class="btn btn-warning">Delete</a></td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
</div>
</body>
</html>
