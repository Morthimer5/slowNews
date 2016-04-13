<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<c:import url="Head.jsp"/>

<body>

    <c:import url="Greeting.jsp"/>



    <c:if test="${logreport == 'Ok'}">

        <div class="header">
            Slow News: Welcome a board!
        </div>

        <div class="board">
            <img class="reportimg" src="images/Ok.jpg">
            <p>
                "Well done!"
            </p>
        </div>
    </c:if>

    <c:if test="${logreport == 'faild'}">

        <div class="header">
            Slow News: Try one more time.
        </div>

        <div class="board">
            <img class="reportimg" src="images/Error.jpg">
            <p>
                "Wrong password or login!"
            </p>
        </div>
    </c:if>

</body>
</html>
