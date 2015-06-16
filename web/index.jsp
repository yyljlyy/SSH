<%--
  Created by IntelliJ IDEA.
  User: lee
  Date: 2015/6/16
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Juyan
  Date: 12-12-15
  Time: 下午12:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Login</title>
</head>
<body>
<s:form action="login" namespace="/"  method="POST">
  用户名：<s:textfield name="userName"  />
  密码：<s:password name="pwd"/>
  <s:submit name="登录" method="check"/>
</s:form>
<s:property value="message"/>
</body>
</html>
