<%-- 
    Document   : success
    Created on : 2020-6-17, 15:48:24
    Author     : 22603
--%>

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
          <img border="0" style="width:930px;height:350px;" src="images/1268974799.jpg">
        </div>
	</div>
<!-- /header -->
<!-- 网页主体部分 -->
    <div id="main">
    	<div id="leftcolumn">
             <div class="project">
                <img  border="0" style="width:215px;height:92px;" src="images/zhuanghuang.png">
                <p>文章1</p>
                <a  href="services.html">查看详情 &gt;&gt;&gt;</a>   
             </div>
             <div class="project">
                <img  border="0" style="width:215px;height:92px;" src="images/zhuanghuang.png">
                <p>文章2</p>
                <a  href="services.html">查看详情 &gt;&gt;&gt;</a>
             </div>
             <div class="project">
                <img  border="0" style="width:215px;height:92px;" src="images/zhuanghuang.png">
                <p>文章3</p>
                <a  href="services.html">查看详情 &gt;&gt;&gt;</a>
             </div>
          <!----经典案例图片列表开始--> 
            <div id="ClassicCase"><a  href="#">more &gt;&gt;</a> </div>
            <!----滚动图片开始-->
       		<div id="demo" >
              <div id="indemo">
                <div id="demo1"> 
                            <a href="#" target="_blank"><img style="width:140px;height:115px;" src="images/zhuanghuang.png" alt="文章1" />文章1</a>
                            <a href="#" target="_blank"><img style="width:140px;height:115px;" src="images/zhuanghuang.png" alt="文章1" />文章1</a>
                            <a href="#" target="_blank"><img style="width:140px;height:115px;" src="images/zhuanghuang.png" alt="文章1" />文章1</a>
                            <a href="#" target="_blank"><img style="width:140px;height:115px;" src="images/zhuanghuang.png" alt="文章1" />文章1</a>
                            <a href="#" target="_blank"><img style="width:140px;height:115px;" src="images/zhuanghuang.png" alt="文章1" />文章1</a>
                            <a href="#" target="_blank"><img style="width:140px;height:115px;" src="images/zhuanghuang.png" alt="文章1" />文章1</a>
                            <a href="#" target="_blank"><img style="width:140px;height:115px;" src="images/zhuanghuang.png" alt="文章1" />文章1</a>
                            <a href="#" target="_blank"><img style="width:140px;height:115px;" src="images/zhuanghuang.png" alt="文章1" />文章1</a>
                 </div>
                 <div id="demo2"></div>
              </div>
            </div>
                <script language="javascript" type="text/javascript">
                        var speed=40; //数字越大速度越慢
                        var tab=document.getElementById("demo");
                        var tab1=document.getElementById("demo1");
                        var tab2=document.getElementById("demo2");
                        tab2.innerHTML=tab1.innerHTML;
                        function Marquee(){
                        if(tab2.offsetWidth-tab.scrollLeft<=0)
                        tab.scrollLeft-=tab1.offsetWidth
                        else{
                        tab.scrollLeft++;
                        }
                        }
                        var MyMar=setInterval(Marquee,speed);
                        tab.onmouseover=function() {clearInterval(MyMar)};
                        tab.onmouseout=function() {MyMar=setInterval(Marquee,speed)};
                </script>
              <!----滚动图片列表结束-->   
           <!----经典案例图片列表结束-->      
        </div>
        <div id="rightcolumn">
         	<div id="CaseList" >
            	<div class="CaseListTitle">
                	<a  href="Case.html">more &gt;&gt;</a>
                </div>
                <div class="anli2">               
                 <ul>
                      <li><a href="news.html"  target="_blank">文章1 </a></li>      
                      <li><a href="news.html"  target="_blank">文章1 </a></li>
                      <li><a href="news.html"  target="_blank">文章1 </a></li>
                      <li><a href="news.html"  target="_blank">文章1 </a></li>
                      <li><a href="news.html"  target="_blank">文章1 </a></li>
                      <li><a href="news.html"  target="_blank">文章1 </a></li>
                      <li><a href="news.html"  target="_blank">文章1 </a></li>
                   </ul>
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
</form>
   
</body>
</html>
