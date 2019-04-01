<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/1
  Time: 20:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>struts2标签库</title>
</head>
<body>
<s:set var="i" value="2" scope="application"/>
<s:if test="#application.i>5">
    i大于5
</s:if>
<s:elseif test="#application.i<5">
    i小于5
</s:elseif>
<s:else>
    i等于5
</s:else>
</body>
</html>
