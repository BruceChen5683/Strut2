<%--
  Created by IntelliJ IDEA.
  User: chenjianliang
  Date: 2018/3/15
  Time: 下午10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--struts标签库--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
    <s:actionerror cssStyle="color: #ff8c66"></s:actionerror>
    <s:fielderror cssStyle="color: blueviolet"></s:fielderror>
    <%--<form action="register.action">--%>
        <%--name:<input type="text" name="name" size="20"><br>--%>
        <%--password:<input type="password" name="password" size="20"><br>--%>
        <%--repassword:<input type="password" name="repassword" size="20"><br>--%>
        <%--age:<input type="text" name="age" size="20"><br>--%>
        <%--birthday:<input type="text" name="birthday" size="20"><br>--%>
        <%--graduation:<input type="text" name="graduation" size="20"><br>--%>
        <%--<input type="submit" value="submit">&nbsp;&nbsp;&nbsp;<input type="reset" value="reset"><br>--%>
    <%--</form>--%>


    <s:form action="register.action">
        <s:textfield name="name" label="name"></s:textfield>
        <s:password name="password" label="password"></s:password>
        <s:password name="repassword" label="repassword"></s:password>
        <s:textfield name="age" label="age"></s:textfield>
        <s:textfield name="birthday" label="birthday"></s:textfield>
        <s:textfield name="graduation" label="graduation"></s:textfield>
        <s:submit label="submit"></s:submit>
    </s:form>
</body>
</html>
