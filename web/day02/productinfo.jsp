<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/28
  Time: 22:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <title>商品信息录入</title>
</head>
<body>
<h1>Struts2复杂类型的数据封装</h1>
<h3>封装到List集合中：批量插入商品</h3>
<form action="${pageContext.request.contextPath}/productAction1" method="post">
    商品名称：<input type="text" name=""/><br/>
    商品价格：<input type="text" name=""/><br/>
    商品名称：<input type="text" name=""/><br/>
    商品价格：<input type="text" name=""/><br/>
    商品名称：<input type="text" name=""/><br/>
    商品价格：<input type="text" name=""/><br/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
