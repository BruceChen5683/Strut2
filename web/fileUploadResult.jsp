<%--
  Created by IntelliJ IDEA.
  User: chenjianliang
  Date: 2018/5/4
  Time: 上午8:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="UTF-8" language="java" import="java.util.*,java.io.*"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>FileUploadResult</title>
</head>
<body>
    <s:property value="fileFileName"></s:property><br>
    <s:property value="fileContentType"></s:property><br>


    <%--<s:iterator value="fileFileName" id="f">--%>
        <%--file:<s:property value="#f"></s:property>--%>
    <%--</s:iterator>--%>

</body>
</html>
