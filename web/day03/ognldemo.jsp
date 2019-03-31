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
<h1>OGNL在Struts2环境中地使用</h1>
<h3>调用对象的方法</h3>
<s:property value="'struts'.length()"/>
<h3>调用对象的静态方法</h3>
<!--静态方法访问在Struts2中默认是关闭的，需要开启一个常量-->
<s:property value="@java.lang.Math@random()"/><hr/>

<h3>OGNL特殊字符的使用</h3>
<h4>#号的使用</h4>
<h6>1、获取context的数据</h6>
<%request.setAttribute("name","林志文");%>
request.name:<s:property value="#request.name"/>
<h6>2、构建Map集合</h6>
List集合：<br/>
<s:iterator var="i" value="{'abc','efg','xyz'}">
    <s:property value="i"/> = <s:property value="#i"/><br/>
</s:iterator>
Map集合：<br/>
<s:iterator var="entry" value="#{'one':'yelf','two':'caolx','three':'wangjin','four':'wangbinxia'}">
    <!--取值方式一-->
    <s:property value="key"/> = <s:property value="value"/><br/>
    <!--取值方式二-->
    <s:property value="#entry.key"/> = <s:property value="#entry.value"/><br/>
</s:iterator>
<h6>构建Map集合的应用</h6>
单选框<br/>
传统方式：<br/>
性别：<input type="radio" name="sex1" value="1"/>男
<input type="radio" name="sex1" value="2"/>女<br/>
OGNL的方式：<br/>
<s:radio list="#{'1':'男','2':'女'}" name="sex2" label="性别"/>

<h4>%号的使用</h4>
<h6>1、强制解析OGNL</h6>
<%request.setAttribute("country","中国");%>
默认不解析：<br/>
<s:textfield name="name" value="#request.country" label="国家"/><br/>
强制解析：<br/>
<s:textfield name="name" value="%{#request.country}" label="国家"/><br/>
<h6>2、强制不解析OGNL</h6>
默认解析：<br/>
<s:property value="#request.country"/><br/>
强制不解析：<br/>
<s:property value="%{'#request.country'}"/>
<h4>$符号的使用</h4>
$符号主要用在配置文件中要使用OGNL表达式的地方
</body>
</html>
