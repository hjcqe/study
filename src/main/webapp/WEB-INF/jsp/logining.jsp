<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String ctx =  request.getContextPath();
%>
<c:set var="ctx" scope="request" value="<%=ctx %>"/>

<html xmlns="http://www.w3.org/1999/xhtml">
    <title>登录页面</title>
<body>
<div>
   假装这是登录页面<br><br>
    <a href="${ctx}/login">登录</a>
</div>
</body>
</html>