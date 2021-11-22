
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Manage Users - eBook</title>
</head>
    <body>
        <jsp:include page="header.jsp" />

        <div align="center">
            <h2>Users management</h2>
            <h3><a href="">Create new User</a></h3>
        </div>

        <div align="center">
            <table border = "1" cellpadding="5">
                <tr>
                    <th>Index</th>
                    <th>Id</th>
                    <th>Email</th>
                    <th>Full Name</th>
                    <th>Actions</th>
                </tr>

                <c:forEach var="user" items="${list}">
                    <tr>
                        <td><c:out value="${status.index + 1}" /></td>
                        <td><c:out value="${user.userId}" /></td>
                        <td><c:out value="${user.email}" /></td>
                        <td><c:out value="${user.fullName}" /></td>
                        <td>
                            <a href="">Edit</a>
                            <a href="">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>

        <div align="center">
        </div>
        <jsp:include page="footer.jsp" />

    </body>
</html>
