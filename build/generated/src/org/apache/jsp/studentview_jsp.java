package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class studentview_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head><title>长春工业大学BBS论坛</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\n");
      out.write("<link href=\"style/layout.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style/common.css\"/>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write(" <div id=\"box\">\n");
      out.write("<!-- header -->\n");
      out.write("\t<div id=\"header\">\n");
      out.write("\t\t<div  id=\"logo\"><img border=\"0\" src=\"images/logo.jpg\" width=\"219\" height=\"65\"></div>\n");
      out.write("        <div id=\"menu\" >\n");
      out.write("             <a href=\"studentview.jsp\" >论坛首页</a>\n");
      out.write("             <a href=\"aboutus.jsp\" >学校相关</a> \n");
      out.write("             <a href=\"postlook\" >浏览文章</a> \n");
      out.write("             <a href=\"studentLogin.jsp\" >登录</a> \n");
      out.write("\t\t</div>\n");
      out.write("        <div  id=\"ad\">\n");
      out.write("          <img border=\"0\" style=\"width:930px;height:350px;\" src=\"images/1268974799.jpg\">\n");
      out.write("        </div>\n");
      out.write("\t</div>\n");
      out.write("<!-- /header -->\n");
      out.write("<!-- 网页主体部分 -->\n");
      out.write("    <div id=\"main\">\n");
      out.write("    \t<div id=\"leftcolumn\">\n");
      out.write("             <div class=\"project\">\n");
      out.write("                <img  border=\"0\" style=\"width:215px;height:92px;\" src=\"images/zhuanghuang.png\">\n");
      out.write("                <p>文章1</p>\n");
      out.write("                <a  href=\"services.html\">查看详情 &gt;&gt;&gt;</a>   \n");
      out.write("             </div>\n");
      out.write("             <div class=\"project\">\n");
      out.write("                <img  border=\"0\" style=\"width:215px;height:92px;\" src=\"images/zhuanghuang.png\">\n");
      out.write("                <p>文章2</p>\n");
      out.write("                <a  href=\"services.html\">查看详情 &gt;&gt;&gt;</a>\n");
      out.write("             </div>\n");
      out.write("             <div class=\"project\">\n");
      out.write("                <img  border=\"0\" style=\"width:215px;height:92px;\" src=\"images/zhuanghuang.png\">\n");
      out.write("                <p>文章3</p>\n");
      out.write("                <a  href=\"services.html\">查看详情 &gt;&gt;&gt;</a>\n");
      out.write("             </div>\n");
      out.write("          <!----经典案例图片列表开始--> \n");
      out.write("            <div id=\"ClassicCase\"><a  href=\"#\">more &gt;&gt;</a> </div>\n");
      out.write("            <!----滚动图片开始-->\n");
      out.write("       \t\t<div id=\"demo\" >\n");
      out.write("              <div id=\"indemo\">\n");
      out.write("                <div id=\"demo1\"> \n");
      out.write("                            <a href=\"#\" target=\"_blank\"><img style=\"width:140px;height:115px;\" src=\"images/zhuanghuang.png\" alt=\"文章1\" />文章1</a>\n");
      out.write("                            <a href=\"#\" target=\"_blank\"><img style=\"width:140px;height:115px;\" src=\"images/zhuanghuang.png\" alt=\"文章1\" />文章1</a>\n");
      out.write("                            <a href=\"#\" target=\"_blank\"><img style=\"width:140px;height:115px;\" src=\"images/zhuanghuang.png\" alt=\"文章1\" />文章1</a>\n");
      out.write("                            <a href=\"#\" target=\"_blank\"><img style=\"width:140px;height:115px;\" src=\"images/zhuanghuang.png\" alt=\"文章1\" />文章1</a>\n");
      out.write("                            <a href=\"#\" target=\"_blank\"><img style=\"width:140px;height:115px;\" src=\"images/zhuanghuang.png\" alt=\"文章1\" />文章1</a>\n");
      out.write("                            <a href=\"#\" target=\"_blank\"><img style=\"width:140px;height:115px;\" src=\"images/zhuanghuang.png\" alt=\"文章1\" />文章1</a>\n");
      out.write("                            <a href=\"#\" target=\"_blank\"><img style=\"width:140px;height:115px;\" src=\"images/zhuanghuang.png\" alt=\"文章1\" />文章1</a>\n");
      out.write("                            <a href=\"#\" target=\"_blank\"><img style=\"width:140px;height:115px;\" src=\"images/zhuanghuang.png\" alt=\"文章1\" />文章1</a>\n");
      out.write("                 </div>\n");
      out.write("                 <div id=\"demo2\"></div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("                <script language=\"javascript\" type=\"text/javascript\">\n");
      out.write("                        var speed=40; //数字越大速度越慢\n");
      out.write("                        var tab=document.getElementById(\"demo\");\n");
      out.write("                        var tab1=document.getElementById(\"demo1\");\n");
      out.write("                        var tab2=document.getElementById(\"demo2\");\n");
      out.write("                        tab2.innerHTML=tab1.innerHTML;\n");
      out.write("                        function Marquee(){\n");
      out.write("                        if(tab2.offsetWidth-tab.scrollLeft<=0)\n");
      out.write("                        tab.scrollLeft-=tab1.offsetWidth\n");
      out.write("                        else{\n");
      out.write("                        tab.scrollLeft++;\n");
      out.write("                        }\n");
      out.write("                        }\n");
      out.write("                        var MyMar=setInterval(Marquee,speed);\n");
      out.write("                        tab.onmouseover=function() {clearInterval(MyMar)};\n");
      out.write("                        tab.onmouseout=function() {MyMar=setInterval(Marquee,speed)};\n");
      out.write("                </script>\n");
      out.write("              <!----滚动图片列表结束-->   \n");
      out.write("           <!----经典案例图片列表结束-->      \n");
      out.write("        </div>\n");
      out.write("        <div id=\"rightcolumn\">\n");
      out.write("         \t<div id=\"CaseList\" >\n");
      out.write("            \t<div class=\"CaseListTitle\">\n");
      out.write("                \t<a  href=\"Case.html\">more &gt;&gt;</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"anli2\">               \n");
      out.write("                 <ul>\n");
      out.write("                      <li><a href=\"news.html\"  target=\"_blank\">文章1 </a></li>      \n");
      out.write("                      <li><a href=\"news.html\"  target=\"_blank\">文章1 </a></li>\n");
      out.write("                      <li><a href=\"news.html\"  target=\"_blank\">文章1 </a></li>\n");
      out.write("                      <li><a href=\"news.html\"  target=\"_blank\">文章1 </a></li>\n");
      out.write("                      <li><a href=\"news.html\"  target=\"_blank\">文章1 </a></li>\n");
      out.write("                      <li><a href=\"news.html\"  target=\"_blank\">文章1 </a></li>\n");
      out.write("                      <li><a href=\"news.html\"  target=\"_blank\">文章1 </a></li>\n");
      out.write("                   </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("<!-- /网页主体部分 -->\n");
      out.write("<!-- footer -->\n");
      out.write("\t<div id=\"footer\">\n");
      out.write("\t\t<div id=\"menuNav\">\n");
      out.write("            <ul>\n");
      out.write("                 <li>|</li>\n");
      out.write("                 <li>关于我们</li>\n");
      out.write("                 <li>|</li>\n");
      out.write("                 <li>服务范围</li>\n");
      out.write("                 <li>|</li>\n");
      out.write("                 <li>联系我们</li>\n");
      out.write("                 <li>|</li>\n");
      out.write("                 <li>留言反馈</li>\n");
      out.write("                 <li>|</li>\n");
      out.write("                 <li>友情链接</li>\n");
      out.write("                 <li>|</li>\n");
      out.write("                 <li>更多</li>\n");
      out.write("            </ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<!-- /footer -->\n");
      out.write("      <div  style=\"clear:both\"></div>\n");
      out.write("</div>\n");
      out.write("</form>\n");
      out.write("   \n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
