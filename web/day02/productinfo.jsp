<%@ taglib prefix="s" uri="/struts-tags" %>
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
<s:fielderror/>
<form action="${pageContext.request.contextPath}/productAction1" method="post">
    商品名称：<input type="text" name="products[0].name"/><br/>
    商品价格：<input type="text" name="products[0].price"/><br/>
    商品名称：<input type="text" name="products[1].name"/><br/>
    商品价格：<input type="text" name="products[1].price"/><br/>
    商品名称：<input type="text" name="products[2].name"/><br/>
    商品价格：<input type="text" name="products[2].price"/><br/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
