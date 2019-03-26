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
<h2>Struts2的入门</h2>
<h3><a href="${pageContext.request.contextPath}/hello.action" target="_blank">Struts2的入门</a> </h3>
<h3><a href="${pageContext.request.contextPath}/POJOAction.action" target="_blank">Action的编写方式1:POJOAction</a> </h3>
<h3><a href="${pageContext.request.contextPath}/ImplAction.action" target="_blank">Action的编写方式2:ImplAction</a> </h3>
<h3><a href="${pageContext.request.contextPath}/SupportAction.action" target="_blank">Action的编写方式3:SupportAction</a> </h3>
<br>
<h2>通过配置method属性访问Action</h2>
<h3><a href="${pageContext.request.contextPath}/userFind.action" target="_blank">调用UserAction的查询</a> </h3>
<h3><a href="${pageContext.request.contextPath}/userDelete.action" target="_blank">调用UserAction的删除</a> </h3>
<h3><a href="${pageContext.request.contextPath}/userUpdate.action" target="_blank">调用UserAction的修改</a> </h3>
<h3><a href="${pageContext.request.contextPath}/userSave.action" target="_blank">调用UserAction的保存</a> </h3>
<br>
<h2>通过配置通配符访问Action</h2>
<h3><a href="${pageContext.request.contextPath}/product_find.action" target="_blank">调用ProductAction的查询</a> </h3>
<h3><a href="${pageContext.request.contextPath}/product_delete.action" target="_blank">调用ProductAction的删除</a> </h3>
<h3><a href="${pageContext.request.contextPath}/product_update.action" target="_blank">调用ProductAction的修改</a> </h3>
<h3><a href="${pageContext.request.contextPath}/product_save.action" target="_blank">调用ProductAction的保存</a> </h3>

</body>
</html>
