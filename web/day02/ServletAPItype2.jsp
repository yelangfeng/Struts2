<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/26
  Time: 21:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ServletAPI</title>
</head>
<body>
<h1>Struts2访问Servlet的API</h1>
<h3>方式一：完全解耦的方式</h3>
<form action="${pageContext.request.contextPath}/ServletAPI_type2.action" method="post">
    姓名：<input type="text" name="name"/><br/>
    密码：<input type="password" name="password"/><br/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
