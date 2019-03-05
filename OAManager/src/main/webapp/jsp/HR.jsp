<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%--
  Created by IntelliJ IDEA.
  User: jiagoushi
  Date: 2019/2/21
  Time: 22:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
    <link rel="stylesheet" href="../css/first.css" type="text/css">
    <link rel="stylesheet" href="../css/zTreeStyle.css" type="text/css">
    <script type="text/javascript" src="../jquery/jquery-1.4.4.min.js"></script>
    <script type="text/javascript" src="../jquery/jquery.ztree.all.js"></script>
    <script type="text/javascript" src="../jquery/jquery.ztree.exhide.min.js"></script>
    <script type="text/javascript" src="../js/HR.js"></script>
    <script type="text/javascript" src="../js/common.js"></script>
</head>
<body style="overflow-x: hidden; overflow-y: hidden">
<div class="top">
    <h2 clas="title">简单的OA管理系统</h2>
</div>
<div class="function">
    <ul class="fs">
        <li><a id="index" href="/indexController/first"><img src="../images/index.png"><span class="letter">首页信息</span></a></li>
        <li><a id="user" href="/indexController/user"><img src="../images/user.png"> <span class="letter">个人信息</span></a></li>
        <li><a id="HR" href="/indexController/queryAllHR"><img src="../images/HR.png"><span class="letter">人力资源</span></a></li>
        <li><a id="attendance" href="/indexController/queryAllatt"><img src="../images/attendance.png"><span class="letter">考勤管理</span></a></li>
        <li><a id="datum"href="/indexController/queryAlldatum"><img src="../images/datum.png"><span class="letter">资料管理</span></a></li>
        <li><a id="staff"href="/indexController/queryAllstaff"><img src="../images/staff.png"><span class="letter">办公用品</span></a></li>
    </ul>
</div>
<div class="left">
    <ul id="ztree" class="ztree"></ul>
</div>
<div class="center">
    <form action="/indexController/query" method="post" class="formHR" id="formHR">
        <input id ="info" class = "info" type="text" name="info" placeholder="请输入工号或者姓名">
        <input id ="qbtn" class="qbtn" type="submit" value="查询">
        <div class="formtable" id="formtable">
            <table class="formReg" border="dotted"  align="center" valign="center">
                <tr>
                    <th>姓名</th>
                    <th>性别</th>
                    <th>年龄</th>
                    <th>工号</th>
                    <th>入职时间</th>
                    <th>职位</th>
                </tr>
                <c:forEach items="${info}" var="list" >
                    <tr>
                        <td>${list.userName}</td>
                        <td>${list.gender}</td>
                        <td>${list.age}</td>
                        <td>${list.workno}</td>
                        <td><fmt:formatDate value="${list.hiredate }" pattern="yyyy-MM-dd"/></td>
                        <td>${list.jobposition}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </form>
</div>
</body>
</html>
