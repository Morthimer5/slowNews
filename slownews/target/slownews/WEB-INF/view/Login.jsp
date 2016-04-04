<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Slow News</title>
    <link rel="stylesheet" href="css/style.css" type="text/css"/>
</head>
<body>

    <c:import url="Greeting.jsp"/>


    <div class="board">
        <form action="/login" method="post">
            <h1>Login</h1>
            <img class="reportimg" src="images/joker.jpg"/><br/>
            Login<br/>
            <input type="text" name="login"><br/>
            Password<br/>
            <input type="text" name="password"><br/><br/>
            <input type="submit" value="Login"><br/>
        </form>
    </div>

</body>
</html>
