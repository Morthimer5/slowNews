<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="greeting">


    <c:if test='${sessionScope.user == "Guest"}'>
        Hello, ${sessionScope.user}!


        <a class="menulink" href="/login">Login</a><br>
        <a class="menulink" href="/registration">Sign in</a>

    </c:if>
    <c:if test='${sessionScope.user != "Guest"}'>
        <p>Hello, ${sessionScope.user.name}!<p>
        <form action="/logout" method="get">
            <input type="submit" value="Logout">
        </form>
    </c:if>

</div>
<div class="menu">
    <p>
        <a class="menulink" href="/news">News</a><br/>
        <a class="menulink" href="/java">Java News</a><br/>


        <c:if test='${sessionScope.user != "Guest"}'>
            <a class="menulink" href="/archive">Archive</a><br/>
            <a class="menulink" href="/allusers">Users</a><br/>
        </c:if>
    </p>
</div>
<div class="search">
    <img src="images/search.png">
    <input class="searchfild" type="text" placeholder="Search">
    <input type="button" value="Look for" onsubmit="highlight()">
</div>

<div class="weather">
    <p>Weather in Kiev:</p>
        <img src="/images/weather/64/${requestScope.weather.sky}.png"></br>
    Temperature: ${requestScope.weather.temperature} &#176; C </br>
</div>

