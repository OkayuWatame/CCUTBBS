package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("<div>\n");
      out.write("    <div>\n");
      out.write("        <h1>注册</h1>\n");
      out.write("        <form action=\"register.action\">\n");
      out.write("            <input type=\"text\" name=\"stuNum\" placeholder=\"学号\"/><br>\n");
      out.write("            <input type=\"text\" name=\"realName\" placeholder=\"姓名\"/><br>\n");
      out.write("            <input type=\"password\" name=\"password\" placeholder=\"密码\" /><br>\n");
      out.write("            <input type=\"text\" name=\"nickName\" placeholder=\"昵称\" /><br>\n");
      out.write("            <input type=\"text\" name=\"qq\" placeholder=\"QQ\" /><br>\n");
      out.write("            <input type=\"text\" name=\"email\" placeholder=\"邮箱\" /><br>\n");
      out.write("            <input type=\"text\" name=\"major\" placeholder=\"专业\" /><br>\n");
      out.write("           <input type=\"text\" name=\"className\" placeholder=\"班级\" /><br>\n");
      out.write("            <p>上传头像<input type=\"file\" name=\"photoPath\" onchange=\"previewImage(this, 'prvid')\" multiple=\"multiple\"/><br></p>\n");
      out.write("            <input type=\"submit\" value=\"注册\"/>\n");
      out.write("                <div id=\"prvid\" style=\"width:100px;height:100px;\"></div>\n");
      out.write("            <p>\n");
      out.write("                <span>已经拥有账号?</span>\n");
      out.write("                <a href=\"studentLogin.jsp\">去登陆</a>\n");
      out.write("            </p>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<script>\n");
      out.write("    function previewImage(file, prvid) {\n");
      out.write("            /* file：file控件 \n");
      out.write("             * prvid: 图片预览容器 \n");
      out.write("             */\n");
      out.write("            var tip = \"Expect jpg or png or gif!\"; // 设定提示信息 \n");
      out.write("            var filters = {\n");
      out.write("                \"jpeg\" : \"/9j/4\",\n");
      out.write("                \"gif\" : \"R0lGOD\",\n");
      out.write("                \"png\" : \"iVBORw\"\n");
      out.write("            }\n");
      out.write("            var prvbox = document.getElementById(prvid);\n");
      out.write("            prvbox.innerHTML = \"\";\n");
      out.write("            if (window.FileReader) { // html5方案 \n");
      out.write("                for (var i = 0, f; f = file.files[i]; i++) {\n");
      out.write("                    var fr = new FileReader();\n");
      out.write("                    fr.onload = function(e) {\n");
      out.write("                        var src = e.target.result;\n");
      out.write("                        if (!validateImg(src)) {\n");
      out.write("                            alert(tip)\n");
      out.write("                        } else {\n");
      out.write("                            showPrvImg(src);\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                    fr.readAsDataURL(f);\n");
      out.write("                }\n");
      out.write("            } else { // 降级处理\n");
      out.write(" \n");
      out.write("                if (!/\\.jpg$|\\.png$|\\.gif$/i.test(file.value)) {\n");
      out.write("                    alert(tip);\n");
      out.write("                } else {\n");
      out.write("                    showPrvImg(file.value);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write(" \n");
      out.write("            function validateImg(data) {\n");
      out.write("                var pos = data.indexOf(\",\") + 1;\n");
      out.write("                for ( var e in filters) {\n");
      out.write("                    if (data.indexOf(filters[e]) === pos) {\n");
      out.write("                        return e;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                return null;\n");
      out.write("            }\n");
      out.write(" \n");
      out.write("            function showPrvImg(src) {\n");
      out.write("                var img = document.createElement(\"img\");\n");
      out.write("                img.src = src;\n");
      out.write("                prvbox.appendChild(img);\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("</script>        \n");
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
