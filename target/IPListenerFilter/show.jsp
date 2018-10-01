<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>IP监听器和过滤器</title>

</head>
<body>

<table align="center" width="60%" border="1">
    <tr>
        <th>IP</th>
        <th>次数</th>
    </tr>
    <c:forEach items="${applicationScope.map}" var="entry">
    <tr>
        <%--<td>${entry.key}</td>
        <td>${entry.value}</td>--%>
        <c:out value="${entry.key}">默认IP</c:out>
        <c:out value="${entry.value}">默认次数</c:out>
    </tr>
    </c:forEach>
</table>

</body>
</html>