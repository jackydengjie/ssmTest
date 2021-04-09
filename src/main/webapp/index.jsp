<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="util.*" %>> <%--导入util包下的所有java文件--%>
<%@page import="java.net.*" %>
<%@page import="java.lang.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>My JSP 'index.jsp' starting page</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
    <meta charset="utf-8" />
    <script src="src/main/webapp/WEB-INF/js/jquery-3.5.1.min.js"></script>

    <%--<script src="http://libs.baidu.com/jquery/1.9.0/jquery.js" type="text/javascript"></script>--%>
    <script type="text/javascript">

        function submit() {
            alert("开始")
            $.modal.loading($("#btnSubmit").data("loading"));
            var uname1 = $("input[name='uname1']").val();
            var uname2 = $("input[name='uname2']").val();
            var uname3 = $("input[name='uname3']").val();

            $.ajax({
                type: "post",
                url: "url",
                data: {
                    "uname1": uname1,
                    "uname2": uname2,
                    "uname3": uname3
                },
                success: function(result) {
                    alert(result);
                }
            });
        }
    </script>
</head>
<body>
<%--<h2>Hello World!</h2>
<form action="${pageContext.request.contextPath}/savePs" method="post">
    <table>
        <tr>
            <td>
                <input type="text" name="uname" id="uname">
            </td>
        </tr>
        <tr>
            <td>
                <input type="text" name="uname" id="uname1">
            </td>
        </tr>
        <tr>
            <td>
                <input type="text" name="uname" id="uname2">
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" id="regist" value="投票">
            </td>
        </tr>
    </table>

</form>--%>
<%

    /*out.print(macaddress);*/
   /* GetMACAddress gmac=new GetMACAddress(); *//*创建一个util包下GetMACAddress.java文件的对象*//*
    String os=gmac.getOSName();
    System.out.println(os);
    if (os.equals("windows 7")) {
        String mac = gmac.getMACAddress();
        System.out.println(mac);
    } else if (os.startsWith("windows")) {
        // 本地是windows
        String mac = gmac.getWindowsMACAddress();
        System.out.println(mac);
    } else {
        // 本地是非windows系统 一般就是unix
        String mac = gmac.getUnixMACAddress();
        System.out.println(mac);
    }*/
%>
<%--<%=
    gmac.GetMacAddress() /*调用方法*/
%>--%>

<form action="${pageContext.request.contextPath}/getLocalIp" method="post">
    <tr><td><input type="submit"   value="提交" /></td></tr>
</form>

<form action="${pageContext.request.contextPath}/getUser" method="post">
    <tr><td><input type="text"  name="uname1" id="uname1" value="1" /></td></tr>
    <tr><td><input type="text"  name="uname2" id="uname2" value="2" /></td></tr>
    <tr><td><input type="text"  name="uname3" id="uname3" value="3" /></td></tr>
    <tr><td><input type="submit"  id="regist" value="提交" /></td></tr>
</form>




</body>
</html>
