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
			<div >请修改您的信息</div>
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
                                            <form action="studentUpdate.action" method="post">
                                        id:        
                            <input name="id" value="<%=info.getId()%>" readonly="readonly"/>                    
					学号：
                            <input name="stuNum" value="<%=info.getStuNum()%>"/>
					<p>
					姓名：
                            <input name="realName" value="<%=info.getRealName()%>"/>
					<p>	
					密码：					
                            <input name="password" value="<%=info.getPassword()%>"/>
					<p>
					昵称：					
                            <input name="nickName" value="<%=info.getNickName()%>"/>
                                        <p>
                            		QQ：					
                            <input name="qq" value="<%=info.getQq()%>"/>
                                        <p>
                            		邮箱：					
                            <input name="email" value="<%=info.getEmail()%>"/>
                                        <p>
                            		专业：					
                            <input name="major" value="<%=info.getMajor()%>"/>
                                        <p>
                                        班级：					
                            <input name="className" value="<%=info.getClassName()%>"/>
                                        <p>
                                	头像：					
                            <input name="photoPath" value="<%=info.getPhotoPath()%>"/>
                            <input type="submit" value="提交"/><br>
                            <a href="studentinfo.jsp">返回</a>
                            </form>

            <%
                        }
                    }
               }
            %>
					</div>
				</div>
			</div>
                    </div>
        <script type="text/javascript" charset="utf-8"  src="https://files.cnblogs.com/files/liuzhou1/L2Dwidget.0.min.js"></script>
        <script type="text/javascript" charset="utf-8"  src="https://files.cnblogs.com/files/liuzhou1/L2Dwidget.min.js"></script>
        <script type="text/javascript">
            "model": { 
                jsonPath: "https://unpkg.com/live2d-widget-model-shizuku@1.0.5/assets/shizuku.model.json",//这是插件模型，可以任意选择想要添加的2d动画
                "scale": 1 
            },

            L2Dwidget.init({
              "display": {
                "superSample": 2,
                "width": 200,//宽度
                "height": 400,//高度
                "position": "right",//位置，right,left
                "hOffset": 0,
                "vOffset": 0
              }
           });
        </script>
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

