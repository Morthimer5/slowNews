<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<c:import url="Head.jsp"/>

<body>
    <c:import url="Greeting.jsp"/>

    <div class="header">
        Slow News: Your archive
    </div>

    <div class="newsboard">


        <c:forEach  var="news" items="${sessionScope.user.newsArchive}" varStatus="loop">



        <div class="article">
                <h1>${news.name}</h1>

                <div class="image">
                    ${news.image}
                </div>

                <p>
                    ${news.text}
                </p>

                <c:if test='${sessionScope.user != "Guest"}'>
                    <form action="/archive" method="post">
                        <input type="hidden" name="remove" value="true">
                        <input type="hidden" name="newsId" value="${loop.index}"/>

                        <input type="submit" value="Remov from archive">
                    </form>
                </c:if>

            </div>
        </c:forEach>
    </div>
</body>
</html>
