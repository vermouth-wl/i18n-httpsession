<%--
  Created by IntelliJ IDEA.
  User: q1591
  Date: 2020-05-12
  Time: 21:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="fm" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title><spring:message code="registerFormTitle"/></title>
</head>
<body>
    <h3><spring:message code="title"/></h3>
    <a href="registerForm?request_locale=zh_CN">中文</a> |
    <a href="registerForm?request_locale=en_US">英文</a> |
    <a href="registerForm?request_locale=ja_JP">日文</a>
    <fm:form action="register" method="post" modelAttribute="user">
        <spring:message code="username"/>
        <fm:input path="username"/><br>
        <spring:message code="password"/>
        <fm:input path="password"/><br>
        <spring:message code="age"/>
        <fm:input path="age"/><br>
        <spring:message code="email"/>
        <fm:input path="email"/><br>
        <spring:message code="phone"/>
        <fm:input path="phone"/><br>
        <input type="submit" value="<spring:message code="submit"/>"/>
    </fm:form>
</body>
</html>
