<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/2/24
  Time: 18:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试Struts2</title>
</head>
<body>
<h1>Struts2的入门</h1>
<h3><a href="${pageContext.request.contextPath}/hello.action">Struts2的入门</a> </h3>
<h3><a href="${pageContext.request.contextPath}/POJOAction.action">Action的编写方式1:POJOAction</a> </h3>
<h3><a href="${pageContext.request.contextPath}/ImplAction.action">Action的编写方式2:ImplAction</a> </h3>
<h3><a href="${pageContext.request.contextPath}/SupportAction.action">Action的编写方式3:SupportAction</a> </h3>

</body>
</html>
