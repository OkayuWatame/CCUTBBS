<%-- 
    Document   : postlook
    Created on : 2020-6-23, 14:39:17
    Author     : 22603
--%>

<%@page import="com.entity.Post"%>
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
             <a href="studentview.jsp" >论坛首页</a>
             <a href="aboutus.jsp" >学校相关</a> 
             <a href="postlook" >浏览文章</a> 
             <a href="studentLogin.jsp" >登录</a> 
		</div>
        <div  id="ad">

        </div>
	</div>
<!-- /header -->
<!-- 网页主体部分 -->
    <div id="main">
			<div >
				<div style="margin-left: 50px;">

            <%
                ArrayList list=(ArrayList)session.getAttribute("allInfo");
                if(list.isEmpty()){
                    %>
                    <tr>
                        <td align="center">
                            <span>暂无帖子!</span>
                        </td>
                    </tr>
                    <%
                }else{%>
                帖子总数：<%=list.size()%><br>
                                    <%
                    for(int i=0;i<list.size();i++){
                        Post info=(Post)list.get(i);
                        %>
                        <form action="postviewing">
                        <tr>
                            <%=i+1%>
                            <a>帖子名：<td><%=info.getName()%></td></a>&nbsp;&nbsp;
                            发布时间：<td><%=info.getPublishTime()%></td>
                            学生id：<td><%=info.getSid()%></td>
                            <input name="id"type="text" style="visibility: hidden;" value="<%=info.getId()%>" /><br>
                    <p>
                        <lable><%=info.getContent()%> </lable>.....<a href="javascript:;">>>收缩</a>
                    </p>
                        </tr>
                        </form>    
                            <br>
                        <%                         
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
  <script type="text/javascript">
  window.onload = function(){
  var oP = document.getElementsByTagName('p')[0];
  var oSpan = oP.getElementsByTagName('lable')[0];
  var oA = oP.getElementsByTagName('a')[0];
  var str = oSpan.innerHTML;
  var onOff = true;
 
  oA.onclick = function(){
  	if( onOff ){
	oSpan.innerHTML=str;
	oA.innerHTML = '>>收缩';
	//onOff = true;
	}else{
	oSpan.innerHTML=str.substring(0,5);//substr slice都可以
	oA.innerHTML = '>>展开';
	//onOff = false;        
	}
	 onOff = !onOff;
  };
 };
  </script> 
</body>
