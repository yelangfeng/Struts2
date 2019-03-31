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
<h1>输出值栈数据（root）</h1>
<s:debug></s:debug>
<!--的获取值栈值：调用ValueStack本身的方法-->
<h2>获取root中数据</h2>
<!--获取一个对象的数据-->
<h4>单个对象中的数据：</h4>
<s:property value="username"/>
<s:property value="password"/><br>
<!--获取集合中的数据-->
<h4>集合对象中的数据：</h4>
<s:property value="list[0].username"/>
<s:property value="list[0].password"/><br/>
<s:property value="list[1].username"/>
<s:property value="list[1].password"/><br/>
<s:property value="list[2].username"/>
<s:property value="list[2].password"/>
<h2>获取context中数据</h2>
<h5>request：</h5>
<s:property value="#request.name"/>
<h5>session：</h5>
<s:property value="#session.name"/>
<h5>application：</h5>
<s:property value="#application.name"/>
<h5>attr：</h5>
<s:property value="#attr.name"/>
<h5>parameters：</h5>
<s:property value="#parameters.id"/>
<h2>EL表达式获取值栈数据（Struts2底层增强）</h2>
root数据：${username}<br/>
context数据：${name}
</body>
</html>
