<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: yelf
  Date: 2019/03/30
  Time: 17:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查看值栈内部结构</title>
</head>
<body>
<h1>查看值栈内部结构</h1>
<s:debug></s:debug>
<!--方式一的获取值栈值：利用Action在值栈中的特性-->
<s:property value="user.username"/>
<s:property value="user.password"/>
<hr/>
<!--方式二的获取值栈值：调用ValueStack本身的方法-->
<s:property value="username"/>
<s:property value="password"/>
<s:property value="name"/>
</body>
</html>
