<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
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
                <input type="submit" id="regist" value="注册">
            </td>
        </tr>
    </table>

</form>


</body>
</html>
