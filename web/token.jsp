<%--
  Created by IntelliJ IDEA.
  User: chenjianliang
  Date: 2018/4/26
  Time: 上午8:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <s:form action="token" theme="simple">
        username:<s:textfield name="username"/><br>
        password:<s:textfield name="password"/><br>
        <s:token></s:token>
        <s:submit value="submit"></s:submit>
    </s:form>
</body>
</html>
