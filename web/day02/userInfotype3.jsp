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
<h3>方式三：模型驱动-模型驱动方式</h3>
<form action="${pageContext.request.contextPath}/userActionType3" method="post">
    用户名：<input type="text" name="username"/><br/>
    密码：<input type="password" name="password"/><br/>
    年龄：<input type="text" name="age"/><br/>
    生日：<input type="text" name="birthday"/><br/>
    工资：<input type="text" name="salary"/><br/>
    <input type="submit" value="提交"/><br/>
</form>
</body>
</html>
