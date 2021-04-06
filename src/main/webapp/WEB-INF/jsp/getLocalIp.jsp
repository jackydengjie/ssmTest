<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/1
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="util.*" %>> <%--导入util包下的所有java文件--%>
<%@page import="java.net.*" %>
<%@page import="java.lang.*" %>
<html>
<head>
    <base href="<%=basePath%>">
    <title>Title</title>
</head>
<body>
<%


%>
</body>
</html>
