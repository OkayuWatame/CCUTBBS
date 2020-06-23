<%-- 
    Document   : adminLogin
    Created on : 2020-6-17, 14:59:01
    Author     : 22603
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style/layout.css"/>
        <link rel="stylesheet" type="text/css" href="style/login.css"/>
        <title>JSP Page</title>
    </head>
    <body background=="images/bgimage.jpg" style=" background-repeat:no-repeat;background-size:100% 100%; background-attachment: fixed;">
	<div class="box">
	<h1 style="text-align:center;color:white;">亲爱的管理员欢迎您</h1>
            <div class="sbox">
                <form action="adminlogin.action" method="post">
                    <input type="text" name="account" class="tx" maxlength="10" placeholder="请输入用户名" ><p>
                    <input type="password" name="password" class="tx" maxlength="10" placeholder="请输入密码" ><p>
                    <input type="submit"  class="tx" value="登录">
                </form>
                <a href="studentLogin.jsp" style="color:red;">会员登录</a><br>
                <a href="studentview.jsp" style="color:red;"> 点击进入首页</a>           
            </div>
	</div>
    </body>
</html>
