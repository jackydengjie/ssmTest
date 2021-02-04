<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
    <script>
        function submit() {
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
<h2>Hello World!</h2>
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

</form>

<div>
    <form id="mainForm" autocomplete="off">
        <input type="text" name="uname1" class="uname1" placeholder="uname1" maxlength="20" />
        <input type="text" name="uname2" class="uname2" placeholder="uname2" maxlength="20" />
        <input type="text" name="uname3" class="uname3" placeholder="uname3" maxlength="20" />
        <button class="btn btn-success btn-block" id="btnSubmit" data-loading="正在提交，请稍后...">提交</button>
    </form>
</div>


</body>
</html>
