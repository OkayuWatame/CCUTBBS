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
             <a href="studentviewaf.jsp" >论坛首页</a>
             <a href="aboutusaf.jsp" >学校相关</a> 
             <a href="boardview" >社区模块</a> 
             <a href="postview" >浏览文章</a>
             <a href="postmineview">我的文章</a>
             <a href="StudentLookInfo">个人信息</a>
             <a href="studentview.jsp" >注销</a> 
		</div>
        <div  id="ad">

        </div>
	</div>
<!-- /header -->
<!-- 网页主体部分 -->
    <div id="main">
			<div >您的个人信息</div>
			<div >
				<div style="margin-left: 50px;">

            <%
                ArrayList list=(ArrayList)session.getAttribute("allInfo");
                String loginflag= session.getAttribute("loginflag").toString(); 
                int loginId =Integer.parseInt(loginflag);
                if(list.isEmpty()){
            %>
                            <span>暂无个人信息!</span>

                    <%
                }else {
                    for(int i=0;i<list.size();i++){
                        Student info = (Student)list.get(i);
                        if(loginId == info.getId()){
                    %>
					<div style="margin-left: 50px;">
					学号：
                            <%=info.getStuNum()%>
					<p>
					姓名：
                            <%=info.getRealName()%>
					<p>	
					密码：					
                            <%=info.getPassword()%>
					<p>
					昵称：					
                            <%=info.getNickName()%>
                                        <p>
                            		QQ：					
                            <%=info.getQq()%>
                                        <p>
                            		邮箱：					
                            <%=info.getEmail()%>
                                        <p>
                            		专业：					
                            <%=info.getMajor()%>
                                        <p>
                                        班级：					
                            <%=info.getClassName()%>
                            
                                <br><a href="studentupdate.jsp"  >修改</a>
            <%
                        }
                    }
               }
            %>
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
