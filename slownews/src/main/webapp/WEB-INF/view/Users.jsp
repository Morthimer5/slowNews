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
        <ul>
        <c:forEach  var="entry" items="${requestScope.users}">
            <div class="user">
                <li class="listUser">${entry.key}<br/> </li>
            </div>
        </c:forEach>
        </ul>
    </div>
</body>
</html>
