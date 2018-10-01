<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<table align="center" width="60%" border="1">
    <tr>
        <th>IP</th>
        <th>次数</th>
    </tr>
    <c:forEach items="${applicationScope.map}" var="entry">
    <tr>
        <td>${entry.key}</td>
        <td>${entry.value}</td>
    </tr>

</table>

</body>
</html>

