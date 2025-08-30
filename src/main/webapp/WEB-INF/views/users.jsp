<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>User List</title>
</head>
<body>
<h2>All Users</h2>

<!-- Таблица пользователей -->
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
                <a href="${pageContext.request.contextPath}/users/delete/${u.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>

<hr/>

<!-- Форма добавления -->
<h2>Add User</h2>
<form:form method="post" modelAttribute="user" action="${pageContext.request.contextPath}/users">
    Name: <form:input path="name"/><br/>
    Age: <form:input path="age"/><br/>
    <input type="submit" value="Add"/>
</form:form>

</body>
</html>
