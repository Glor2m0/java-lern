<%--
  Created by IntelliJ IDEA.
  User: SuperUser
  Date: 17.07.2018
  Time: 20:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.servletContext.contextPath}/user/newclient" method="POST">
    <table>
        <tr>
            <td align="right" >Name : </td>
            <td>
                <input type="text" name="name">
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
