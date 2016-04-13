<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<c:import url="Head.jsp"/>

<body>
    <c:import url="Greeting.jsp"/>

    <div class="header">
        Slow News: Awesome people!
    </div>

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
