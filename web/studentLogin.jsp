<!--
20182946-刘志健
-->

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
    <body background="/images/bgimage.jpg" style=" background-repeat:no-repeat ;background-size:100% 100%; background-attachment: fixed;">
        <div class="box">
            <div class="sbox">
            <form action="login.action" method="post">
		<input type="text" name="nickName" class="tx" maxlength="10" placeholder="请输入用户名" ><p>
		<input type="password" name="password" class="tx" maxlength="10" placeholder="请输入密码" ><p>
		<input type="submit" class="tx" value="登录"><p>
                <a href="register.jsp" style="color:red;">没有账号？点击注册</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="adminLogin.jsp" style="color:red;">管理员登录</a><br>
                <a href="studentview.jsp" style="color:red;"> 点击进入首页</a>      
            </form>
            </div>    
        </div>
    </body>
</html>
