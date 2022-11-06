<%--
  Created by IntelliJ IDEA.
  User: VuHongLinh
  Date: 06/11/2022
  Time: 3:14 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<div class="container mt-3">
  <h2>Contextual Classes</h2>
  <p>Contextual classes can be used to color the table, table rows or table cells. The classes that can be used are: .table-primary, .table-success, .table-info, .table-warning, .table-danger, .table-active, .table-secondary, .table-light and .table-dark:</p>
  <table class="table">
    <thead>
    <tr>
      <th>Id</th>
      <th>User Name</th>
      <th>Pass Word</th>
      <th>Address</th>
      <th>Birthday</th>
      <th>Phone Number</th>
      <th>id_role</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items = "${showAccount}" var="sa">
      <tr class="table-white">
        <td>${sa.id}</td>
        <td>${sa.username}</td>
        <td>${sa.password}</td>
        <td>${sa.address}</td>
        <td>${sa.birthday}</td>
        <td>${sa.phonenumber}</td>
        <td>${sa.id_role}</td>
        <td><a type="button" class="btn btn-danger" href="/deleteAccount?id=${sa.id}">Delete</a></td>
        <td><a type="button" class="btn btn-danger" href="/?id=${sa.id}">edit</a></td>

      </tr>
    </c:forEach>

    </tbody>
  </table>
</div>