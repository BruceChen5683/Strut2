<%--
  Created by IntelliJ IDEA.
  User: chenjianliang
  Date: 2018/7/9
  Time: 下午10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>wait</title>

    <meta http-equiv="refresh" content="5;url=<s:url includeParams="all"/> "/>
</head>
<body>
等待界面

<a href="<s:url includeParams="all" />">  Click </a>if this page does not reload automatically.
</body>
</html>
