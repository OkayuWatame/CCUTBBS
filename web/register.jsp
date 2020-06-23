<%-- 
    Document   : register
    Created on : 2020-6-17, 15:05:11
    Author     : 22603
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
<body>
<div>
    <div>
        <h1>注册</h1>
        <form action="register.action">
            <input type="text" name="stuNum" placeholder="学号"/><br>
            <input type="text" name="realName" placeholder="姓名"/><br>
            <input type="password" name="password" placeholder="密码" /><br>
            <input type="text" name="nickName" placeholder="昵称" /><br>
            <input type="text" name="qq" placeholder="QQ" /><br>
            <input type="text" name="email" placeholder="邮箱" /><br>
            <input type="text" name="major" placeholder="专业" /><br>
           <input type="text" name="className" placeholder="班级" /><br>
            <input type="submit" value="注册"/>
                <div id="prvid" style="width:100px;height:100px;"></div>
            <p>
                <span>已经拥有账号?</span>
                <a href="studentLogin.jsp">去登陆</a>
            </p>
        </form>
    </div>
</div>
       
</body>
</html>
