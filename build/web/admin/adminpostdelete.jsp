<%-- 
    Document   : adminpostdelete
    Created on : 2020-6-21, 18:13:56
    Author     : 22603
--%>

<%@page import="com.entity.Post"%>
<%@page import="com.entity.Admin"%>
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
			<div ><h1>全部文章</h1></div>
			<div >
				<div style="margin-left: 50px;">
            <%
            ArrayList list=(ArrayList)session.getAttribute("allInfo");
            for(int i=0;i<list.size();i++){
            %>                            

        <form action="postdel" method="post">
        <table align="center" width="70%" border="5">
            <tr>
                <td>
<%
                Post info=(Post)list.get(i);
                                    %>                
					文章名：《
                            <%=info.getName()%>》&nbsp;
					发布时间：
                            <%=info.getPublishTime()%>&nbsp;	
					学生id：					
                            <%=info.getSid()%>&nbsp;
					板块号：					
                            <%=info.getBid()%>&nbsp;
                    <input name="id"type="text" style="visibility: hidden;" value="<%=info.getId()%>" /> 
                    <p>
                        <lable><%=info.getContent()%> </lable>.....<a href="javascript:;">>>收缩</a>
                    </p>
                </td>
                <td>
                    <input type="submit" value="删除"></s:submit>
                </td>
            </tr>
        </table>
        </form><br>
                                    <%
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
</html>
