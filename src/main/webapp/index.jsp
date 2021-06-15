<%--
  Created by IntelliJ IDEA.
  User: 当然是选择原谅我哦
  Date: 2020/5/16
  Time: 22:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<head>
<%
    pageContext.setAttribute("APP_PATH", request.getContextPath());
%>

<%--   web路径：
            不以/开始的相对路径，找资源是以当前资源的路径为基准，经常容易出问题
            而以/开始的相对路径，是以服务器的路径为标注的（http://localhost:3306），需要加上项目名
                    http://localhost:3306/crud
   --%>
<script src="${APP_PATH}/static/js/jquery-3.1.1.js"></script>
<link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

</head>
<body>

<h2>主页</h2>
<div>
    <button class="btn btn-info">管理员</button>
    <button class="btn btn-danger">用户</button>
</div>

<li><a href="${APP_PATH}/findusers?pn=1">管理员</a></li>

</body>
</html>
