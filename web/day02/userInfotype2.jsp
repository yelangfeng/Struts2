<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: yelf
  Date: 2019/03/27
  Time: 12:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>填写用户数据</title>
</head>
<body>
<h3>方式二：属性驱动-在页面中提供表达式方式</h3>
<s:fielderror/>
<form action="${pageContext.request.contextPath}/userActionType2" method="post">
    用户名：<input type="text" name="user.username"/><br/>
    密码：<input type="password" name="user.password"/><br/>
    年龄：<input type="text" name="user.age"/><br/>
    生日：<input type="text" name="user.birthday"/><br/>
    工资：<input type="text" name="user.salary"/><br/>
    <input type="submit" value="提交"/><br/>
</form>
</body>
</html>
