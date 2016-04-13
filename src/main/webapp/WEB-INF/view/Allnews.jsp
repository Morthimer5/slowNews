<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<c:import url="Head.jsp"/>

<body>
    <div class="header">
        Slow News: Some fresh news here!
    </div>

    <c:import url="Greeting.jsp"/>

    <div class="newsboard">


        <c:forEach  var="news" items="${requestScope.newsList}" varStatus="loop">


            <div class="article" >
                <div class="head" onclick="showFunction('newsbody${loop.index}')">
                    <h1 >${news.name}</h1>
                </div>

                <div class="newsbody" id="newsbody${loop.index}">
                <div class="image">
                   ${news.image}
                </div>

                <p>
                    ${news.text}
                </p>

                <c:if test='${sessionScope.user != "Guest"}'>
                    <form action="/archive" method="post">
                        <input type="hidden" name="remove" value="false">
                        <input type="hidden" name="topic" value="${requestScope.topic}">
                        <input type="hidden" name="newsId" value="${loop.index}"/>

                        <input type="submit" value="Add to archive">
                    </form>
                </c:if>
                </div>
            </div>
        </c:forEach>
    </div>
</body>
</html>
