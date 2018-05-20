<%--
  Created by IntelliJ IDEA.
  User: chenjianliang
  Date: 2018/5/20
  Time: 下午8:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="scripts/jquery-3.2.1.js"></script>

    <script type="text/javascript">
        function getInfo() {
            $.post("getXMLAction.action",
                {
                    name: $("#name").val()
                }, function (returnedData, status) {
                    alert(returnedData);
//                    var name = $(returnedData).find("name").text();
////                    var name1 = "testtest";
////                    alert(name);
//                    var html = "<h1 $name1></h1>";
////                    $("#none table:eq(0)").remove();
//                    $("#none").append(html);
                });
        }
    </script>
</head>
<body id="none">
    <select id="name">
        <option value="test1">test1</option>
        <option value="test2">test2</option>
    </select>

    <input type="button" value="get info" onclick="getInfo();">
</body>
</html>
