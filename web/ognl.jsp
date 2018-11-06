<%@ page import="com.opensymphony.xwork2.ActionContext" %>
<%@ page import="java.util.Map,com.cjl.www.ognl.OnglAction" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: chenjianliang
  Date: 2018/6/25
  Time: 上午8:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    username:<s:property value="username"></s:property><br>
    password:<s:property value="password"></s:property><br>
    ------------------<br>
    username:<s:property value="#parameters.username"></s:property><br>
    password:<s:property value="#parameters.password"></s:property><br>
    ------------------<br>

    request:<s:property value="#request.hello"></s:property><br>
    session:<s:property value="#session.hello"></s:property><br>
    request:<s:property value="#application.hello"></s:property><br>

    -------------<br>

    <%= ((Map)ActionContext.getContext().get("request")).get("hello") %>

    .<br>
    .<br>
    .<br>

    --------<br>

    person1 : address : <s:property value="list[0].address"></s:property><br>
    person1 : age : <s:property value="list[1].age"></s:property><br>
    person1 : cat1 : name <s:property value="list[0].cat.name"></s:property><br>


    _________<br>

    <%--<%= ((OnglAction)ActionContext.getContext().getValueStack().peek()).getList().get(0).getAddress() %><br>--%>


    person2 :map2:<s:property value="list[1].map['m22']"></s:property><br>
     <%--<%= ActionContext.getContext().getValueStack().pop() %>--%>
    <%--<%= ActionContext.getContext().getValueStack().pop() %>--%>


------------<br>

filtering :<s:property value="list.{? #this.name.length() > 5}[0].name"></s:property>

    ------------<br>

<s:iterator value="list. {? #this.name.length() > 2}">
    <s:property value="name"></s:property><br>
    <s:property value="cat.color"></s:property><br>

    projection:
    <s:property value="list.{age}"></s:property><br>
    <s:property value="age"></s:property><br>
</s:iterator>



</body>
</html>
