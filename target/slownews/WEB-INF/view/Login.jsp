<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<c:import url="Head.jsp"/>

<body>

    <c:import url="Greeting.jsp"/>

    <div class="header">
        Slow News: Who are you?
    </div>


    <div class="board">
        <form action="/login" method="post">
            <h1>Login</h1>
            <div class="image">
                <img class="reportimg" src="images/Who.jpg"/>
            </div>
            Login<br/>
            <input type="text" name="login"><br/>
            Password<br/>
            <input type="password" name="password"><br/><br/>
            <input type="submit" value="Login"><br/>
        </form>
    </div>

</body>
</html>
