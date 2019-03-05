<%--
  Created by IntelliJ IDEA.
  User: jiagoushi
  Date: 2019/2/27
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
</head>
<body>
<div class="login">
    <form class="forml" id="forml" action="/indexController/index" method="post">
        <label id="user">工号</label>
        <input class="workno" type="text" name="workno" placeholder="请输入工号">
        <label id="pass">密码</label>
        <input class="pasword" type="text" name="pasword" placeholder="请输入密码">
        <input type="submit" value="登录">
    </form>
</div>
</body>
</html>
