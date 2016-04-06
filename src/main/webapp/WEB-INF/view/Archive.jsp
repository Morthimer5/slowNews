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
        Slow News: Your archive
    </div>

    <div class="newsboard">


        <c:forEach  var="entry" items="${sessionScope.user.newsArchive}">


            <div class="article">
                <h1>${entry.value.name}</h1>

                <div class="image">
                    <img class="picture" src="images/${entry.value.image}">
                </div>

                <p>
                        ${entry.value.text}
                </p>

                <c:if test='${sessionScope.user != "Guest"}'>
                    <form action="/archive" method="post">
                        <input type="hidden" name="remove" value="true">
                        <input type="hidden" name="newsId" value="${entry.value.id}"/>

                        <input type="submit" value="Remov from archive">
                    </form>
                </c:if>

            </div>
        </c:forEach>
    </div>
</body>
</html>
