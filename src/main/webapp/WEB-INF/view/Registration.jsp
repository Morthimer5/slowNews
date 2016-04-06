<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Slow News</title>
    <link rel="stylesheet" href="css/style.css" type="text/css"/>
</head>
<body>
    <c:import url="Greeting.jsp"/>

    <div class="header">
        Slow News: Nice to meet you.
    </div>

<div class="board">
    <form action="/registration" method="post">
        <p><h1>Registration</h1></p>

            Name<br/>
            <input type="text" name="name"><br/>
            Login<br/>
            <input type="text" name="login"><br/>
            e-mail<br/>
            <input type="e-mail" name="mail"><br/>
            Password<br/>
            <input type="password" name="password"><br/>
            Confirm password<br/>
            <input type="password" name="confirmPassword"><br/><br/>
            <input type="submit" value="Ok">
    </form>
</div>
</body>
</html>
