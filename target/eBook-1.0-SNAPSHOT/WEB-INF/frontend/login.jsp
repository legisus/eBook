<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
    <body>
        <jsp:include page="header.jsp"/>

        <div align="center">
            <h2>Please login:</h2>
            <form>
                Email: <input type="text" size="10"><br/>
                Passsword: <input type="password" size="10" />
                <input type="submit" value="Login" />
            </form>
        </div>

        <jsp:include page="footer.jsp"/>

     </body>
</html>
