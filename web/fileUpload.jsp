<%--
  Created by IntelliJ IDEA.
  User: chenjianliang
  Date: 2018/5/4
  Time: 上午8:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="utf-8" language="java" import="java.util.*,java.io.*"%>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<%--文件上传post 编码类型multipart/form-data--%>
    <form action="fileUpload" method="post" enctype="multipart/form-data">
        user:<input type="text" name="user"><br>
        file:<input type="file" name="file"><br>
        <input type="submit" value="submit">
    </form>
</body>
</html>
