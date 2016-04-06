<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="greeting">


    <c:if test='${sessionScope.user == "Guest"}'>
        <p>Hello, ${sessionScope.user}!<p>
        <form class="g_button" action="/login" method="get">
            <input type="submit" value="Login">
        </form>
        <form class="g_button" action="/registration" method="get">
            <input type="submit" value="Sign up">
        </form>
    </c:if>
    <c:if test='${sessionScope.user != "Guest"}'>
        <p>Hello, ${sessionScope.user.name}!<p>
        <form action="/logout" method="get">
            <input type="submit" value="Logout">
        </form>
    </c:if>

    <div class="weather">

    </div>

</div>
<div class="menu">
    <p>
        <a href="/news">News</a><br/>

        <c:if test='${sessionScope.user != "Guest"}'>
            <a href="/archive">Archive</a><br/>
            <a href="/allusers">Users</a><br/>
        </c:if>
    </p>
</div>

