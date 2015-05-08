<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 5/7/2015
  Time: 8:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add drug to db</title>
</head>
<body>
  <form action="<c:url value='/createDrug' />" method='POST'>

    <input type="text" placeholder="drug name" name="name">
    <input type="number" placeholder="Patient Id" name="id">

    <button> Insert</button>

  </form>


</body>
</html>
