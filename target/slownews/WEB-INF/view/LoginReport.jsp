<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Slow News</title>
    <link rel="stylesheet" href="css/style.css" type="text/css"/>
</head>
<body>

    <c:import url="Greeting.jsp"/>

    <c:if test="${logreport == 'Ok'}">
        <div class="board">
            <img class="reportimg" src="images/Ok.jpg">
            <p>
                "Well done!"
            </p>
        </div>
    </c:if>

    <c:if test="${logreport == 'pass'}">
        <div class="board">
            <img class="reportimg" src="images/Error.jpg">
            <p>
                "Wrong password!"
            </p>
        </div>
    </c:if>

    <c:if test="${logreport == 'login'}">
        <div class="board">
            <img class="reportimg" src="images/Error.jpg">
            <p>
                "Wrong login!"
            </p>
        </div>
    </c:if>

</body>
</html>
