<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>eBook</title>
</head>
<body>
    <jsp:include page="header.jsp" />

    <div align="center">
        <h2>Administrative Dash Board</h2>
    </div>
    <div align="center">
        <hr width="60%" />
        <h2>Quick Actions:</h2>
            <b>
                <a href="create_book">New Book</a> &nbsp;
                <a href="create_user">New User</a> &nbsp;
                <a href="create_category">New Category</a> &nbsp;
                <a href="create_customer">New Customer</a>
            </b>
    </div>

    <div align="center">
        <hr width="60%" />
        <h2>Recent Sales:</h2>
    </div>

    <div align="center">
        <hr width="60%" />
        <h2>Recent Reviews:</h2>
    </div>

    <div align="center">
        <hr width="60%" />
        <h2>Statistics:</h2>
        <hr width="60%" />
    </div>

    <jsp:include page="footer.jsp" />

</body>
</html>
