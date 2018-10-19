<%@page isELIgnored="false" pageEncoding="UTF-8" contentType="text/html; UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
    <c:forEach items="${requestScope.list}" var="user">
        ${user.user_id}
        ${user.username}
        ${user.pwd}
        ${user.sex}
    </c:forEach>
123asd123asd
</body>
</html>
