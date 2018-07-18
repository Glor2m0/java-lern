<%--
  Created by IntelliJ IDEA.
  User: SuperUser
  Date: 17.07.2018
  Time: 21:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>ClientsView</title>
</head>
<body>

<table border="1">
    <tr>
        <td>Имя клиента</td>
        <td>Имя питомца</td>
        <td>Действия</td>
    </tr>
    <c:forEach items="${clients}" var="client" varStatus="status">
        <tr valign="top">
            <td>${client.getClientName} </td>
            <td>${client.clientName}</td>
            <td>
                <a href="${pageContext.servletContext.contextPath}/user/edit?id=${client.id}">Редактировать</a>
                <a href="${pageContext.servletContext.contextPath}/user/delete?id=${client.id}">Удалить</a>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="${pageContext.servletContext.contextPath}/views/user/UserView.jsp">Назад</a>
</body>
</html>
