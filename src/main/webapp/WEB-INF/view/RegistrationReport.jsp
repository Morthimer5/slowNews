<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sloe News</title>
    <link rel="stylesheet" href="css/style.css" type="text/css"/>
</head>
<body>
    <c:import url="Greeting.jsp"/>

    <c:if test="${regreport == 'Ok'}">
        <div class="board">
            <img class="reportimg" src="images/Ok.jpg">
            <p>
                "Well done!"
            </p>
        </div>
    </c:if>

    <c:if test="${regreport == 'Pass'}">
        <div class="board">
            <img class="reportimg" src="images/Error.jpg">
            <p>
                "Passwords mismatch!"
            </p>
        </div>
    </c:if>

    <c:if test="${regreport == 'occupied'}">
        <div class="board">
            <img class="reportimg" src="images/Error.jpg">
            <p>
                "Login is already in use!"
            </p>
        </div>
    </c:if>
    <c:if test="${regreport == 'emptyField'}">
        <div class="board">
            <img class="reportimg" src="images/Error.jpg">
            <p>
                "One or more fields are empty!"
            </p>
        </div>
    </c:if>
</body>
</html>
