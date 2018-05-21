<%--
  Created by IntelliJ IDEA.
  User: chenjianliang
  Date: 2017/10/9
  Time: 下午10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script type="text/javascript" src="scripts/jquery-3.2.1.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#button1").click(function () {
                $.get("getJsonAction2.action",{name:$("#name").val()},function (returnData,status) {
                    var html = "<table width='60%' border='1' align='center'><tr><th>id</th><th>name</th><th>age</th><th>homeAddress</th>";

//                    for (var i = 0;i < returnData.length;i++){
                        var person = returnData;

                        var id = person.id;
                        var name = person.name;
                        var age = person.age;
                        var homeAddress = person.homeAddress;

                        html += "<tr align='center'><td>" + id + "</td><td>" +name+"</td><td>"+ age
                            +"</td><td>"+homeAddress+"</td>"

//                    }

                    html += "</table>";

                    $("#theBody table:eq(0)").remove();

                    $("#theBody").append(html);
                })
            });
        })

    </script>
</head>
<body id="theBody">

<select id="name">
    <option value="test1">test1</option>
    <option value="test2">test2</option>
</select>
<input type="button" value="get json content from servlet" id="button1">

</body>
</html>
