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
<h1>UI标签</h1>
<h3>传统的表单</h3>
<form action="${pageContext.request.contextPath}/uiAction" method="post">
    用户名：<input type="text" name="username"/> <br/>
    密 码：<input type="password" name="password"/><br/>
    性 别:<input type="radio" name="sex" value="男"/>男
    <input type="radio" name="sex" value="女"/>女<br/>
    年 龄：<input type="text" name="age"/><br/>
    籍 贯：<select name="city">
        <option value="">-请选择-</option>
        <option value="北京">北京</option>
        <option value="上海">上海</option>
        <option value="广州">广州</option>
        <option value="深圳">深圳</option>
    </select><br/>
    爱 好：<input type="checkbox" name="hobby" value="lanqiu"/>篮球
    <input type="checkbox" name="hobby" value="zuqiu"/>足球
    <input type="checkbox" name="hobby" value="bpqiu"/>乒乓球
    <input type="checkbox" name="hobby" value="paiqiu"/>排球
    <input type="checkbox" name="hobby" value="yumaoqiu"/>羽毛球<br/>
    介 绍：<textarea name="info" cols="30" rows="5">abc</textarea><br/>
    <input type="submit" value="提交"/>
</form>
<h3>UI标签库的表单</h3>
<s:form action="uiAction" namespace="/" method="POST">
    <s:textfield name="username" label="用户名"/>
    <s:password name="password" label="密 码"/>
    <s:textfield name="age" label="年龄"/>
    <s:radio list="#{'男':'男','女':'女'}" label="性 别" name="sex"/>
    <s:select list="{'-请选择-','北京','上海','广州','深圳'}" name="city" label="籍 贯"/>
    <s:checkboxlist list="#{'lanqiu':'篮球','zuqiu':'足球','bpqiu':'乒乓球','paiqiu':'排球','yumaoqiu':'羽毛球'}" name="hobby" label="爱 好"/>
    <s:textarea label="介绍" name="info" cols="30" rows="5" value="abc"/>
    <s:submit value="提交"/>
</s:form>
</body>
</html>
