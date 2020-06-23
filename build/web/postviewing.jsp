<%-- 
    Document   : postviewing
    Created on : 2020-6-21, 12:32:23
    Author     : 22603
--%>

<%@page import="com.entity.Reply"%>
<%@page import="com.action.PostViewingAction"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.entity.Post"%>
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
			<div ></div>
			<div >
				<div style="margin-left: 50px;">
                                <div style="margin-left: 50px;">
                    <%      
                    ArrayList list=(ArrayList)session.getAttribute("oneInfo");
                    Post info = (Post)list.get(0);
                    %>
                        
                       <tr>
                            <h1><td><%=info.getName()%></td></h1><br>
                            发布时间：<td><%=info.getPublishTime()%></td><br>
                            学生id：<td><%=info.getSid()%></td><br><br>
                            内容：<td><%=info.getContent()%></td><br>
                            <br>                  
                        </tr><br>
                            <hr>
                            <h1>回复</h1>    
                        <%
                            ArrayList L=(ArrayList)session.getAttribute("allreply");
                            for(int j=0;j<L.size();j++){
                            Reply reply=(Reply)L.get(j);
                            if(reply.getPid()==info.getId()){%>
                            <form>    
                               <tr>
                                    &nbsp;&nbsp;&nbsp;&nbsp;学生Id：<td><%=reply.getSid()%></td>
                                    发布时间：<td><%=reply.getPublishTime()%></td><br>
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;回帖：<td><%=reply.getContent()%></td>
                                    <input name="id"type="text" style="visibility: hidden;" value="<%=reply.getId()%>" />      
                                    <br>                  
                                </tr>
                            </form><hr>
<%                            }                            
                    }%>                                
                                
					</div>
               <input type="button" value="回帖" onclick='location.href=("replywrite.jsp")' />
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
