<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Slow News</title>
    <link rel="stylesheet" href="css/style.css" type="text/css"/>
</head>
<body>

<c:import url="Greeting.jsp"/>

<div class="newsboard">
    <c:forEach var="news" items="${newslist}" >

        <div class="article">
            <p>Topic: ${news.topic}</p>
            <h1>${news.name}</h1>

            <div class="image">
                <img class="picture" src="images/${news.image}">
            </div>

            <p>
                    ${news.text}
            </p>

            <c:if test='${sessionScope.user != "Guest"}'>
                <form action="/archive" method="post">
                    <input type="hidden" name="newsId" value="${news.id}"/>

                    <input type="submit" value="Add to archive">
                </form>
            </c:if>

        </div>
    </c:forEach>
</div>
</body>
</html>
