<%--
  Created by IntelliJ IDEA.
  User: SuperUser
  Date: 17.07.2018
  Time: 20:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.servletContext.contextPath}/user/newClient" method="POST">
    <table>
        <tr>
            <td align="right" >Name : </td>
            <td>
                <input type="text" name="Cname">
            </td>
        </tr>
        <tr>
            <td align="right" >Pet name : </td>
            <td>
                <input type="text" name="petName">
            </td>
        </tr>
        <tr>
            <td><input type="submit" align="center" value="Submit"/></td>
        </tr>
    </table>
</form>
</body>
</html>
