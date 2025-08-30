<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>User List</title>
</head>
<body>
<h2>All Users</h2>

<table border="1" cellpadding="5">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Age</th>
        <th>Action</th>
    </tr>
    <c:forEach var="u" items="${users}">
        <tr>
            <td>${u.id}</td>
            <td>${u.name}</td>
            <td>${u.age}</td>
            <td>
                <c:url var="delUrl" value="/users/delete/${u.id}"/>
                <a href="${delUrl}" onclick="return confirm('Delete user #${u.id}?');">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>

<hr/>

<h2>Add User</h2>
<c:url var="addUrl" value="/users"/>
<form:form method="post" modelAttribute="user" action="${addUrl}">
    Name: <form:input path="name"/><br/>
    Age: <form:input path="age"/><br/>
    <input type="submit" value="Add"/>
</form:form>

</body>
</html>
