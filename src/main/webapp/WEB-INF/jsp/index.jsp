<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Spring Boot Sample</title>
</head>

<body>
<form action="add">

    他的所有汽车
    <c:forEach items="${user.names}" var="vo" varStatus="i">
        汽车${i.index}是<input type="text" name="names[${i.index}].name" value="${vo.name}">说明是<input type="text" name="names[${i.index}].desc" value="${vo.desc}">
    </c:forEach>
    <input type="submit" value="提交">
</form>
</body>
</html>