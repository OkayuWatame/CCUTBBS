<%-- 
    Document   : adminboardupdate
    Created on : 2020-6-21, 18:13:21
    Author     : 22603
    类比于注册
--%>
<%@page import="com.entity.Board"%>
<%@page import="com.entity.Student"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head><title>长春工业大学BBS论坛</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<link href="style/layout.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="style/common.css"/>
</head>
<body>
 <div id="box">
<!-- header -->
	<div id="header">
		<div  id="logo"><img border="0" src="images/logo.jpg" width="219" height="65"></div>
        <div id="menu" >
             <a href="./adminview.jsp" >首页</a>
             <a href="adboardview" >板块管理</a> 
             <a href="adpost" >文章管理</a>
             <a href="adstudent" >会员管理</a>              
             <a href="adinfo">个人信息</a>
             <a href="./studentview.jsp" >注销</a>  
		</div>
        <div  id="ad">

        </div>
	</div>
<!-- /header -->
<!-- 网页主体部分 -->
            <div id="main">
			<div ><h1>板块信息</h1></div>
                    <div>
                            <div style="margin-left: 50px;">
                            <form action="boardadd.action">
                                版名：<input type="text" name="name"/><br>
                                描述：<input type="text" name="description"/><br>
                                版id：<input type="text" name="parentId"/><br>
                                管理员id：<input type="text" name="aid"/><br>    
                                <input type="submit" value="添加"/>
                            </form>
                                    

                            </div>
		    </div>
            </div>
    </div>
<!-- /网页主体部分 -->
<!-- footer -->
	<div id="footer">
		<div id="menuNav">
            <ul>
                 <li>|</li>
                 <li>关于我们</li>
                 <li>|</li>
                 <li>服务范围</li>
                 <li>|</li>
                 <li>联系我们</li>
                 <li>|</li>
                 <li>留言反馈</li>
                 <li>|</li>
                 <li>友情链接</li>
                 <li>|</li>
                 <li>更多</li>
            </ul>
		</div>
	</div>
<!-- /footer -->
      <div  style="clear:both"></div>
</div>
   
</body>
</html>