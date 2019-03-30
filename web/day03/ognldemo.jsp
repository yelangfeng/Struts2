<%--
  Created by IntelliJ IDEA.
  User: yelf
  Date: 2019/03/30
  Time: 15:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>OGNL在Struts2环境中的入门</title>
</head>
<body>
<h1>OGNL在Struts2环境中的入门</h1>
<h3>调用对象的方法</h3>
<s:property value="'struts'.length()"/>
<h3>调用对象的静态方法</h3>
<!--静态方法访问在Struts2中默认是关闭的，需要开启一个常量-->
<s:property value="@java.lang.Math@random()"/>
</body>
</html>
